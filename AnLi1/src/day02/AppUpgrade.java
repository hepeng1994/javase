package day02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mysql.jdbc.BufferRow;

/**
 * 1.读入文件 2.把数据切分 3.把前4个数据组成一个 4.装进数组里 5.把list排序 6.创建一个对象并所需对象封装进去 7.时间进行排序
 */
public class AppUpgrade {
	public static void main(String[] args) {
		ComboPooledDataSource com =new ComboPooledDataSource();
		QueryRunner qu = new QueryRunner(com); 
		String sct ="INSERT INTO AppBean VALUES(?,?,?,?,?,?)";
		Map<String, List<String>> a = getinfo();
		List<AppBean> d = new ArrayList<AppBean>();
		Set<Entry<String, List<String>>> en = a.entrySet();
		for (Entry<String, List<String>> entry : en) {
			List<String> value = entry.getValue();
			SortUtil.sortByVersons(value);
			if (value.size() > 1) {
				// 获取最大版本与最小版本
				String minValue = value.get(0);
				String maxValue = value.get(value.size() - 1);
				// 分割key
				String[] split = entry.getKey().split(",");
				String date = split[0];
				String userName = split[1];
				String appName = split[2];
				String from = split[3];
				AppBean dd = new AppBean();
				dd.set(date, userName, appName, from, minValue, maxValue);
				d.add(dd);

			}

		}
		SortUtil.sortByappBean(d);
		
			try (BufferedWriter f = new BufferedWriter(new FileWriter(
					"D:\\练习/app1.txt"));) {
				for (AppBean entry : d) {
				System.out.println(entry);
				try {
					qu.update(sct,entry.getDate(),entry.getUserName(),entry.getAppName(),entry.getFrom(),entry.getMinVlaue(),entry.getMaxValue());
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				f.write(entry.toString());
				f.newLine();
				f.flush();
					}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	private static Map<String, List<String>> getinfo() {
		Map<String, List<String>> b = new HashMap<String, List<String>>();
		try (BufferedReader a = new BufferedReader(new FileReader(
				"D:\\练习/app.txt"));) {
			String str;
			while ((str = a.readLine()) != null) {
				String[] split = str.split(",");
				String data = split[0];
				String userName = split[1];
				String appName = split[2];
				String from = split[3];
				String version = split[5];
				String stt = data + "," + userName + "," + appName + "," + from;
				if (b.containsKey(stt)) {
					List<String> list = b.get(stt);
					list.add(version);
					b.put(stt, list);
				} else {
					ArrayList<String> arr = new ArrayList<String>();
					arr.add(version);
					b.put(stt, arr);
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}
}
