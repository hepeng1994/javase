package day07.test3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import dayzixi.liulaing.utils;


public class MainTest1 {
	public static void main(String[] args) {
		//录入数据
		try (BufferedReader a =new BufferedReader(new InputStreamReader(new FileInputStream("E:\\x\\案例分析\\day07-单车定位/bj-poi-1.csv"),"gbk"));
			BufferedWriter b =new BufferedWriter(new FileWriter("D:\\新建文件夹\\新建文件夹 (2)/b.txt"));
				){
			String str;
			while((str=a.readLine())!=null){
				try {
					String[] split = str.split(",");
					//富燕新村一区19号楼,地名地址信息;门牌信息;楼栋号,115.985824,39.71796,北京市房山区迎风街道富燕新村一区19号楼富燕新村1区,北京市,10,房山区,北庄路,110111,190403,房山区,115.9797662,39.71680763,115.9924356,39.72362741
					String locationx = split[2];
					String locationy = split[3];
					String addr = split[4];
					String province = split[5];
					String district = split[7];
					double latx = Double.parseDouble(locationx);
					double laty = Double.parseDouble(locationy);
					String geohash = utilstest3.geohash(latx,laty);
					String stt=geohash+"\t"+"北京市"+"\t"+province+"\t"+district+"\t"+addr;
					b.write(stt);
					b.newLine();
					b.flush();
				} catch (Exception e) {
					continue;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
