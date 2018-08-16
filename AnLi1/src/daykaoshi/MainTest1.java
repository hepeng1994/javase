package daykaoshi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;



import com.mchange.v2.c3p0.ComboPooledDataSource;

import day09.model.User;

/**
 * 问题1.计算出各个省的成交量总额（结果保存到MySQL中）
 * 
 * @author ASUS
 *
 */
public class MainTest1 {
	public static void main(String[] args) {
		 Map<Long, String> modelMap = modelMap();
		//创建map集合封装用户信息
		Map<String ,Integer> map=new HashMap<String, Integer>();
		//读取订单数据
		try (BufferedReader a =new BufferedReader(new FileReader("E:\\考试题目和数据/订单数据.log"));){
			String str =null;
			while((str=a.readLine())!=null){
				//分割数据
				//A 202.106.196.115 手机 iPhone8 8000
				String[] split = str.split(" ");
				 String user=split[0];
				 long ip=util.ZhuanHuan(split[1]);
				 String products=split[2] ;
				 String brand=split[3];
				 int price=Integer.parseInt(split[4]);
				 //通过ip查找身份
				 String province = modelMap.get(ip);
				 Integer orDefault = map.getOrDefault(province, 0);
				 orDefault+=price;
				 map.put(province, orDefault);
				 
			}
			//输入数据库
			ComboPooledDataSource dd = new ComboPooledDataSource();
			Set<Entry<String, Integer>> entrySet = map.entrySet();
			for (Entry<String, Integer> entry : entrySet) {
				
				String b ="insert into product1 (privoce,price) values(?,?)";
				QueryRunner q = new QueryRunner(dd);
				q.update(b,entry.getKey(),entry.getValue());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
/**
 * 解析省份与对应Ip放入集合
 */
	public static Map<Long, String>  modelMap() {
		// 创建集合封装省份IP等
		Map<Long, String> map = new HashMap<>();
		// 获取输入输出流
		try (BufferedReader br = new BufferedReader(new FileReader(
				"E:\\考试题目和数据/省份ip地址.txt"));) {
			String str = null;
			while ((str = br.readLine()) != null) {
				// 分割字符串
				// 北京 202.106.196.115 202.106.0.20
				String[] split = str.split(" ");
				String province = split[0];
				String ip1 = split[1];
				long long1 = util.ZhuanHuan(ip1);
				String orDefault = map.getOrDefault(long1 , null);
				orDefault=province;
				map.put(long1, province);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return map;
	}
}
