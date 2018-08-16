package day04.test1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;

import day04.RatinBean;

public class RatinUtil2 {

	public static void sortValue(List<RatinBean> value) {
		Collections.sort(value, new Comparator<RatinBean>() {

			@Override
			public int compare(RatinBean o1, RatinBean o2) {
				return o2.getRate().compareTo(o1.getRate());
			}
		});
	}

	public static void sortInteger(List<Entry<String, Integer>> c) {
		Collections.sort(c,new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1,
					Entry<String, Integer> o2) {
				return o2.getValue()-o1.getValue();
			}
		});
	}

}
