package day04.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import day04.RatinBean;

public class MainTest2 {
	public static void main(String[] args) {
		Map<String, List<RatinBean>> u = MainTest1.useInfo();

		// 录入数据
		try (BufferedWriter a = new BufferedWriter(new FileWriter(
				"D:\\练习/lala2.txt"));) {
			Set<Entry<String, List<RatinBean>>> entrySet = u.entrySet();
			for (Entry<String, List<RatinBean>> entry : entrySet) {
				String key = entry.getKey();
				List<RatinBean> value = entry.getValue();
				float sum = 0;
				for (RatinBean ra : value) {
					float p = Float.parseFloat(ra.getRate());
					sum += p;
				}
				int size = value.size();
				float avg = sum / size;
				String c = "用户:" + key + "平均评分:" + String.format("%.2f", avg);
				a.write(c);
				a.newLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
