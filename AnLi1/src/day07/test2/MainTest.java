package day07.test2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class MainTest {
	public static void main(String[] args) {
		//录入数据
		try (BufferedReader a =new BufferedReader(new InputStreamReader(new FileInputStream("E:\\x\\案例分析\\案例分析新\\day07-单车定位\\bj-poi-1.csv"),"gbk" ));
			BufferedWriter b =new BufferedWriter(new FileWriter("D:\\新建文件夹/b.txt"));
				){
			String str;
			a.readLine();
			while((str=a.readLine())!=null){
				//铸造村1区14号楼,地名地址信息;门牌信息;楼栋号,116.15312,39.925657,北京市石景山区金顶街街道铸造村铸造村1区,北京市,10,石景山区,广宁路,110107,190403,铸造村一区14号楼,116.1468885,39.92431392,116.1594895,39.93197676
				try {
					String[] split = str.split(",");
					String locationx = split[2];
					String locationy = split[3];
					String addr = split[4];
					String province = split[5];
					String district = split[7];
					double latx = Double.parseDouble(locationx);
					double laty = Double.parseDouble(locationy);
					String geoHash = utils2.getGeoHash(laty,latx);
					String stt=geoHash+"\t"+"北京市"+"\t"+province+"\t"+district+"\t"+addr;
					System.out.println(stt);
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
