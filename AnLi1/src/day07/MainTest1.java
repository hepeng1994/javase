package day07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.GetMethod;

import com.alibaba.fastjson.JSON;

public class MainTest1 {
	static Map<String, String> map = null;
	static {
		map = map();
	}

	public static void main(String[] args) {
		// 录入数据
		try (BufferedReader a = new BufferedReader(new FileReader(
				"E:\\x\\案例分析\\day07-单车定位/bikes.log"));
				BufferedWriter ba = new BufferedWriter(new FileWriter(
						"D:\\新建文件夹\\新建文件夹/c.txt"));) {
			String str;
			while ((str = a.readLine()) != null) {
				BikeBean p = JSON.parseObject(str, BikeBean.class);
				double lat = Double.parseDouble(p.latitude);
				double lon = Double.parseDouble(p.longitude);

				// 查找
				String find = find(lon, lat);
				 System.out.println(find);
				if (find != null) {
					ba.write(find);
					ba.newLine();
					ba.flush();
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据经纬度查找所在地址 1.本地查找 2.网上查找
	 * 
	 * @param lon
	 * @param lat
	 */
	private static String find(double lon, double lat) {
		String fingBen = fingBen(lon, lat);
		if (fingBen == null) {
			try {
				String find = findWang(lon, lat);
				return find;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return fingBen;
	}

	/**
	 * 网络查找
	 * 
	 * @param lon
	 * @param lat
	 * @throws IOException
	 * @throws HttpException
	 */
	private static String findWang(double lon, double lat) {
		HttpClient a = new HttpClient();
		String url = "http://gc.ditu.aliyun.com/regeocoding?l=" + lat + ","
				+ lon + "&type=010";
		GetMethod getMethod = new GetMethod(url);
		String re = null;
		try {
			a.executeMethod(getMethod);
			re = getMethod.getResponseBodyAsString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 解析数据
		WangLuoBean p = JSON.parseObject(re, WangLuoBean.class);
		// System.out.println(p);
		// WangLuoBean [queryLocation=[32.009, 112.12255], addrList=[AddrList
		// [name=王冠蛋糕(沃尔玛店), admName=湖北省,襄樊市,襄城区,]]]
		// System.out.println(p.addrList[0].name);
		String[] split = p.addrList[0].admName.split(",");
		if (split.length > 2) {
			String geohash = utils.geohash(lon, lat);
			String stt = geohash + "\t" + split[0] + "\t" + split[1] + "\t"
					+ split[2] + "\t" + p.addrList[0].name;
			// 写入本地数据库
			BufferedWriter ba;
			try (BufferedWriter cee = new BufferedWriter(new FileWriter(
					"d:/a.txt", true));) {
				cee.write(stt);
				cee.newLine();
				cee.flush();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			map.put(geohash, stt);

		}
		return null;
	}

	/**
	 * 本地查找
	 * 
	 * @param lon
	 * @param lat
	 * @return
	 */
	private static String fingBen(double lon, double lat) {
		String geohash = utils.geohash(lon, lat);
		String string = map.get(geohash);
		return string;
	}

	/**
	 * 读取数据
	 */
	public static Map<String, String> map() {
		// 创建map合集封装数据
		Map<String, String> b = new HashMap<>();
		// 读取数据
		try (BufferedReader a = new BufferedReader(new FileReader("d:/a.txt"));) {
			String str;
			while ((str = a.readLine()) != null) {
				String[] split = str.split("\t");
				b.put(split[0], str);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}
}
