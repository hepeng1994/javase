package day03.test1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainTest {
	public static void main(String[] args) {
		//创建map集合
		Map<String,Integer> b =new HashMap<>();
		//录入id数据
		List<IpBean> ip = IpUtil.Ip();
		//录入user数据
		try (BufferedReader a=new BufferedReader(new FileReader("D:\\x\\案例分析\\day03-ip地址归属地\\access.log"));
				){
			String str;
			while((str=a.readLine())!=null){
				String[] split = str.split("\\|");
				String userId = split[1];
				//转换为十进制
				long byId = IpUtil.byId(userId);
				//从id数据中找出ipbean
				IpBean byBean = IpUtil.byBean(byId);
				String p = byBean.getProvince();
				//判断并放入集合
				Integer count = b.getOrDefault(p, 0);
				count++;
				b.put(p, count);
			}
			//排序并遍历
			IpUtil.bian(b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
