package day03.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainTest {
	public static void main(String[] args) {
		//创建Map集合
		Map<String,Integer> ma =new HashMap<>();
		//录入ip数据
		List<IpBean>a =IpUtils1.IP();
		//录入access数据
		try (BufferedReader b =new BufferedReader(new FileReader("D:\\x\\案例分析\\day03-ip地址归属地\\access.log"));
				){
			String str;
			while((str=b.readLine())!=null){
				String[] split = str.split("\\|");
				String startid=split[1];
				//将ip转换为十进制
				long userIp = IpUtils1.zhuanHuan(startid);
				//用userIp查找对应ipbean
				
				IpBean Bean = IpUtils1.byBean(userIp);
				String province = Bean.getProvince();
				//统计各省数量并装入Map
				Integer count = ma.getOrDefault(province, 0);
				count++;
				ma.put(province, count);
			}
			IpUtils1.sort(ma);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
