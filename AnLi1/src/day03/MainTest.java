package day03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import day03.test.IpBean;

public class MainTest {
	// 加载IpBean 优化程序
	static List<IpBean> list = null;
	static {
		List<IpBean> list = IpLuRu();
	}

	public static void main(String[] args) {
		//建立Map
		Map<String,Integer> b =new HashMap<>();
		
		// 读入用户数据
		try (BufferedReader a = new BufferedReader(new FileReader(
				"D:\\x\\案例分析\\day03-ip地址归属地\\access.log"));) {
			String str;
			while ((str = a.readLine()) != null) {
				// 20090121000132095572000|125.213.100.123|show.51.com|/shoplist.php?phpfile=shoplist2.php&style=1&sex=137|Mozilla/4.0
				// (compatible; MSIE 6.0; Windows NT 5.1; SV1; Mozil
				// 获取ip,并转换为十进制
				String[] split = str.split("\\|");
				String userIp = split[1];
				long zhuanHuan = IpUtils.ZhuanHuan(userIp);
				
				//从ip中查找对应的ipbean
				IpBean chazhao = IpUtils.chazhao(zhuanHuan);
				String p= chazhao.getProvince();
				
				//判断并装入mapzhong
				
				Integer count = b.getOrDefault(p, 0);
				count++;
				b.put(p, count);
			}
			IpUtils.sort(b);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static List<IpBean> IpLuRu() {
		// 创建List
		List<IpBean> b = new ArrayList<IpBean>();
		// 读取ip数据
		try (BufferedReader a = new BufferedReader(new FileReader(
				"D:\\x\\案例分析\\day03-ip地址归属地\\ip.txt"));) {
			String str;
			// 分割数据
			// 1.0.1.0|1.0.3.255|16777472|16778239|亚洲|中国|福建|福州||电信|350100|China|CN|119.306239|26.075302
			while ((str = a.readLine()) != null) {
				String[] split = str.split("\\|");
				String startId = split[0];
				String endId = split[1];
				long startDecId = Long.parseLong(split[2]);
				long endDecId = Long.parseLong(split[3]);
				String province = split[6];
				String city = split[7];
				String carrieroperator = split[9];
				// 封装进javabean
				IpBean Ip = new IpBean();
				Ip.set(startId, endId, startDecId, endDecId, province, city,
						carrieroperator);
				b.add(Ip);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}

}
