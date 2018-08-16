package day07.test1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;

import com.alibaba.fastjson.JSON;

import day07.utils;

public class MainTest2 {
	static Map<String,String> map=null;
	static{
		map=map();
	}
	public static void main(String[] args) {
		//录入数据
		try (BufferedReader a =new BufferedReader(new FileReader("E:\\x\\案例分析\\day07-单车定位/bikes.log"));
			BufferedWriter b=new BufferedWriter(new FileWriter("D:\\新建文件夹/c.txt"));
				){
			String str;
			while((str=a.readLine())!=null){
				BikeBean p = JSON.parseObject(str,BikeBean.class);
				//BikeBean [event_type=1, page=/pages/index/index, time=2018-03-14 12:35:22,
				//uid=oF-8j0aNka8IQYCZsxyrO6X7jzqY, longitude=112.12255, latitude=32.009,
				//province=湖北省, city=襄阳市, distric=null]
				double lat = Double.parseDouble(p.latitude);
				double lon = Double.parseDouble(p.longitude);
				//查找定位
				String find = find(lat,lon);
				if (find!=null) {
					b.write(find);
					b.newLine();
					b.flush();
					System.out.println(find);
					
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
/**
 * 用lat与lon查找定位
 * 本地查找
 * 网络查找
 * @param lat
 * @param lon
 */
	private static String find(double lat, double lon) {
		//本地查找
		String findBen = findBen(lat,lon);
		if (findBen==null) {
			String find=findWang(lat,lon);
			return find;
		}
		return findBen;
	}
	/**
	 * 网络查找
	 * @param lat
	 * @param lon
	 */
	private static String findWang(double lat, double lon) {
	HttpClient h = new HttpClient();
	String url = "http://gc.ditu.aliyun.com/regeocoding?l=" + lat + ","
			+ lon + "&type=010";
	GetMethod getMethod = new GetMethod(url);
	String re=null;
	try {
		h.executeMethod(getMethod);
		re = getMethod.getResponseBodyAsString();
	} catch (IOException e) {
		e.printStackTrace();
	}
	WangLuoBean p = JSON.parseObject(re, WangLuoBean.class);
	String[] split = p.addrList[0].admName.split(",");
	String sct=null;
	
	String geohash = utils.geohash(lat, lon);
	if (split.length>2) {
		sct =geohash+"\t"+split[0]+"\t"+split[1]+"\t"+split[2]+"\t"+p.addrList[0].name;
		try (BufferedWriter a =new BufferedWriter(new FileWriter("D:\\新建文件夹/a.txt",true));){
			a.write(sct);
			a.newLine();
			a.flush();
			map.put(geohash, sct);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}return sct;
	
}
	/**
	 * 本地查找
	 * @param lat
	 * @param lon
	 */
private static String findBen(double lat, double lon) {
	String geohash = utils1.geohash(lat, lon);
	String string = map.get(geohash);
	return string;
	
}
/**
 * ;创建map
 * @return
 */
public static Map<String,String> map(){
	//创建map
	Map<String,String> b =new HashMap<>();
	try (BufferedReader a =new BufferedReader(new FileReader("D:\\新建文件夹/a.txt"));
			){
		String str;
		while((str=a.readLine())!=null){
			String[] split = str.split("\t");
			
			b.put(split[0], str);
		}
	} catch (Exception e) {
		e.printStackTrace();
	}return b;
}
}
