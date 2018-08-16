package day07.test3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.jsoup.Jsoup;

import com.alibaba.fastjson.JSON;

import day07.test2.AddrList;
import day07.test2.BikeBean;
import day07.test2.WangLuoBean;

public class MainTest2 {
	static Map<String, String> map = null;
	static {
		map = map();
	}

	public static void main(String[] args) {
		// 输入数据
		try (BufferedReader a = new BufferedReader(new FileReader(
				"E:\\x\\案例分析\\day07-单车定位/bikes.log"));

		) {
			String str;
			while ((str = a.readLine()) != null) {
				// 解析数据
				BikeBean p = JSON.parseObject(str, BikeBean.class);
				double lat = Double.parseDouble(p.getLatitude());
				double lon = Double.parseDouble(p.getLongitude());
				// 查找
				String find = find( lon, lat);
				if (find!=null) {
					System.out.println(find);
					
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据经纬度查找定位 1.本地查找 2.网络查找
	 * 
	 * @param lat
	 * @param lon
	 */
	private static String find(double lat, double lon) {
		// 本地查找
		String findBen = findBen(lat, lon);
		if (findBen == null) {
			// 网络查找
			String findWang = findWang(lat, lon);
			return findWang;
		}
		return findBen;
	}

	/**
	 * 网络查找
	 * 
	 * @param lat
	 * @param lon
	 */
	private static String findWang(double lat, double lon) {
		String geohash = utilstest3.geohash(lat, lon);
		HttpClient h = new HttpClient();
		String url = "http://gc.ditu.aliyun.com/regeocoding?l=" + lon + ","
				+ lat + "&type=010";
		GetMethod getMethod = new GetMethod(url);
		String re = null;
		try {
			h.executeMethod(getMethod);
			re = getMethod.getResponseBodyAsString();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		WangLuoBean p = JSON.parseObject(re,WangLuoBean.class);
		 String[] split = p.getAddrList()[0].getAdmName().split(",");
		 String stt =null;
		 if (split!=null&&split.length>2) {
			 stt =geohash+"\t"+split[0]+"\t"+split[1]+"\t"+split[2]+"\t"+p.getAddrList()[0].getName();
			 try (BufferedWriter a =new BufferedWriter(new FileWriter("D:\\新建文件夹\\新建文件夹 (2)/b.txt",true));){
				a.write(stt);
				a.newLine();
				a.flush();
				
			} catch (IOException e) {
				e.printStackTrace();
			}map.put(geohash, stt);
		}return stt;
	}

	/**
	 * 本地查找
	 * 
	 * @param lat
	 * @param lon
	 */
	private static String findBen(double lat, double lon) {
		String geohash = utilstest3.geohash(lat, lon);
		String str = map.get(geohash);
		return str;
	}

	/**
	 * 导入数据
	 * 
	 * @return
	 */
	private static Map<String, String> map() {
		// 创建map合集
		Map<String, String> b = new HashMap<>();
		// 录入数据
		try (BufferedReader a = new BufferedReader(new FileReader(
				"D:\\新建文件夹\\新建文件夹 (2)/b.txt"));) {
			String str;
			while ((str = a.readLine()) != null) {
				String[] split = str.split("\t");
				b.put(split[0], str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return b;
	}
}
