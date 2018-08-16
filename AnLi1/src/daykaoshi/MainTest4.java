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

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 问题4.构建每一个用户的用户画像，就是根据用户购买的具体商品，给用户打上一个标签，为将来的商品推荐系统作数据支撑
 * 
 * 思路: 1.把标签做成文件 2.读取标签文件封装成map 3.读取用户信息 4.创建标签对象 5.查找对象所需信息 6.把把用户,标签封装进map<>
 * 7.输出到数据库
 * 
 * @author ASUS
 *
 */
public class MainTest4 {
	private static List<String> orDefault;

	/**
	 * 思路: 1.把标签做成文件 2.读取标签文件封装成map 3.读取用户信息 4.查找响应标签 5.创建标签对象
	 *  7.输出到数据库
	 */
	public static void main(String[] args) {
		// 读取标签信息
		Map<String, List<String>> bianqianMap = bianqianMap();
		// 创建map封装商品和标签
		Map<String, List<String>> map = new HashMap<>();
		// 数据库
		ComboPooledDataSource dd = new ComboPooledDataSource();
		// 读取用户信息
		try (BufferedReader a = new BufferedReader(new FileReader(
				"E:\\考试题目和数据/订单数据.log"));) {
			String str = null;
			while ((str = a.readLine()) != null) {
				// 分割数据
				// A 202.106.196.115 手机 iPhone8 8000
				String[] split = str.split(" ");
				String user = split[0];
				long ip = util.ZhuanHuan(split[1]);
				String products = split[2];
				String brand = split[3];
				int price = Integer.parseInt(split[4]);
				// 根据商品查找对应标签
				List<String> list = bianqianMap.get(brand);
				// 黏贴标签
				StringBuilder sb = new StringBuilder();
				if (list != null && list.size() > 0) {

					for (String string : list) {
						sb.append(string + ",");
					}
				}
				String stt = sb.toString();
				// 插入数据库
				String b = "insert into product4 (id ,products,biaoqian) values(?,?,?)";
				QueryRunner q = new QueryRunner(dd);
				q.update(b, user, brand,stt);
				//

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 读取标签信息
	 */
	private static Map<String, List<String>> bianqianMap() {
		// 创建map合集
		Map<String, List<String>> b = new HashMap<>();
		try (BufferedReader a = new BufferedReader(new FileReader(
				"E:\\考试题目和数据/biaoqian.txt"));) {
			String str;
			while ((str = a.readLine()) != null) {
				String[] split = str.split(" ");
				String brand = split[1];
				String biaoqian = split[2];
				List<String> orDefault = b.getOrDefault(brand,
						new ArrayList<String>());
				orDefault.add(biaoqian);
				b.put(brand, orDefault);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}
}
