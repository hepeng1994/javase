package day07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class MainTest {
	public static void main(String[] args) {
		//录入数据"E:\\x\\案例分析\\day07-单车定位/bj-poi-1.csv"
		try (BufferedReader a =new BufferedReader(new InputStreamReader(new FileInputStream("E:\\x\\案例分析\\day07-单车定位/bj-poi-1.csv"),"gbk"));
			BufferedWriter b =new BufferedWriter(new FileWriter("D:\\新建文件夹\\新建文件夹/a.txt"))
				){
			a.readLine();
			String str;
			while((str=a.readLine())!=null){
			//鱼斗泉村	地名地址信息;普通地名;村庄级地名	115.444855	39.776652	北京市房山区蒲洼乡鱼斗泉村	北京市	10	房山区	政府街	110111	190108	房山区	115.4383649	39.77531859	115.4512428	39.78298834
				
					try {
						String[] split = str.split(",");
						String locationx = split[2];
						String locationy = split[3];
						String addr = split[4];
						String province = split[5];
						String district = split[7];
						double lx= Double.parseDouble(locationx);
						double ly= Double.parseDouble(locationy);
						String geohash = utils.geohash(lx,ly);
						String stt =geohash+"\t"+"北京市"+"\t"+province+"\t"+district+"\t"+addr;
						//System.out.println(stt);
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
