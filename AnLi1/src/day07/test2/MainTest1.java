package day07.test2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;

import com.alibaba.fastjson.JSON;

public class MainTest1 {
	static  Map<String, String> map =null;
	static{
		map=map();
	}
	public static void main(String[] args) {
		//录入数据
		try (BufferedReader a =new BufferedReader(new FileReader("E:\\x\\案例分析\\案例分析新\\day07-单车定位/bikes.log"));
				){
			String str;
			while((str=a.readLine())!=null){
				BikeBean p = JSON.parseObject(str,BikeBean.class);
				double lat = Double.parseDouble(p.latitude);
				double lon = Double.parseDouble(p.longitude);
				String find = find(lat,lon);
				if (find!=null) {
					System.out.println(find);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
/**
 * 根据经纬度chazhaodingwei
 * 1.本地查找
 * 2.网络查找
 * @param lat
 * @param lon
 */
	private static String find(double lat, double lon) {
		//本地查找
		String findBen = findBen(lat,lon);
		if (findBen==null) {
			//网络查找
			//String findBen1 = findWang(lat,lon);
			//return findBen1;
		}
		return findBen;
	}
	/**
	 * 网络查找
	 * @param lat
	 * @param lon
	 */
	private static String findWang(double lat, double lon) {
		String geoHash = utils2.getGeoHash(lat, lon);
		HttpClient h = new HttpClient();
		String url = "http://gc.ditu.aliyun.com/regeocoding?l=" + lat + "," + lon + "&type=010";
		GetMethod getMethod = new GetMethod(url);
		String re=null;
		try {
			h.executeMethod(getMethod);
			re = getMethod.getResponseBodyAsString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		WangLuoBean p = JSON.parseObject(re, WangLuoBean.class);
		String[] split = p.getAddrList()[0].getAdmName().split(",");
		String stt=null;
		if (split!=null&&split.length>2) {
			 stt=geoHash+"\t"+split[0]+"\t"+split[1]+"\t"+split[2]+"\t"+p.getAddrList()[0].getName();
			try (BufferedWriter a =new BufferedWriter(new FileWriter("D:\\新建文件夹/b.txt",true));){
				a.write(stt);
				a.newLine();
				a.flush();
				map.put(geoHash, stt);
				} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}return stt;
		
	}
	/**
	 * 本地查找
	 * @param lat
	 * @param lon
	 * @return
	 */
	private static String findBen(double lat, double lon) {
		String geoHash = utils2.getGeoHash(lat, lon);
		String string =map.get(geoHash);
		return string;
}
	/**
	 * 创建map合集,方便查找
	 * @return
	 */
	public static Map<String, String> map(){
		//创建map合集
		Map<String, String> b =new HashMap<String, String>();
		try (BufferedReader a =new BufferedReader(new FileReader("D:\\新建文件夹/b.txt"));
				){
			String str;
			while((str=a.readLine())!=null){
				String[] split = str.split("\t");
				String stt=split[0]+"\t"+ split[1]+"\t"+split[2]+"\t"+split[3]+"\t"+split[4];
				b.put(split[0], stt);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}return b;
	}
}
