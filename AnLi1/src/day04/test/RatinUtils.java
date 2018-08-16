package day04.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import day04.RatinBean;

public class RatinUtils {

	public static void sortValue(List<RatinBean> value) {
		Collections.sort(value, new Comparator<RatinBean>() {

			@Override
			public int compare(RatinBean o1, RatinBean o2) {
				return o2.getRate().compareTo(o1.getRate());
			}
		});
	}


	public static void sortAvg(List<Entry<String, Float>> b) {
		Collections.sort(b,new Comparator<Entry<String, Float>>() {

			@Override
			public int compare(Entry<String, Float> o1, Entry<String, Float> o2) {
				return o2.getValue()-o1.getValue()>0?1:-1;
			}
		});
	}


	public static void sortInteger(ArrayList<Entry<String, Integer>> arrayList) {
		Collections.sort(arrayList, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1,
					Entry<String, Integer> o2) {
				return o2.getValue()-o1.getValue();
			}
		});
	}

}
