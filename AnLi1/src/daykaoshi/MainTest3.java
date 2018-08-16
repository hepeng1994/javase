package daykaoshi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 问题3.计算每个商品分类的成交总额，并按照从高到低排序（结果保存到MySQL中）
 * @author ASUS
 *
 */
public class MainTest3 {
	public static void main(String[] args) {
		//创建map封装数据
		Map<String,Integer> map =new HashMap<>();
		//读取数据
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
				 //封装进map并相加
				 Integer orDefault = map.getOrDefault(products, 0);
				 orDefault+=price;
				 map.put(products, orDefault);
			}
			Set<Entry<String, Integer>> entrySet = map.entrySet();
			List<Entry<String, Integer>> lsit =new ArrayList<Entry<String,Integer>>(entrySet);
			//排序
			util.sort(lsit);
			//输出
			ComboPooledDataSource dd = new ComboPooledDataSource();
			for (int i = 0; i <Math.min(3,lsit.size()); i++) {
				String b ="insert into product3 (products,price) values(?,?)";
				QueryRunner q = new QueryRunner(dd);
				q.update(b,lsit.get(i).getKey(),lsit.get(i).getValue());
			}
		
		} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
