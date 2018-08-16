package day07.test1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import dayzixi.liulaing.utils;

public class MainTest1 {
	public static void main(String[] args) {
		//录入数据
		try(BufferedReader a =new BufferedReader(new InputStreamReader(new FileInputStream("E:\\x\\案例分析\\day07-单车定位/bj-poi-1.csv"),"gbk"));
			BufferedWriter b =new BufferedWriter(new FileWriter("D:\\新建文件夹/a.txt"));
				) {
			String str;
			a.readLine();
			while((str=a.readLine())!=null){
				try {
					String[] split = str.split(",");
					String locationx = split[2];
					String locationy = split[3];
					String addr = split[4];
					String province = split[5];
					String district = split[7];
					double lox =Double.parseDouble(locationx);
					double loy =Double.parseDouble(locationy);
					String geohash = utils1.geohash(loy,lox);
					String stt=geohash+"\t"+"北京市"+"\t"+province+"\t"+district+"\t"+addr;
					b.write(stt);
					b.newLine();
					b.flush();
				} catch (Exception e) {
					continue;
				}
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
