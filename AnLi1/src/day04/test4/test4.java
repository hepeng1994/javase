package day04.test4;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;

public class test4 {

	public static void sortValue(List<RatinBean> value) {
		Collections.sort(value, new Comparator<RatinBean>() {

			@Override
			public int compare(RatinBean o1, RatinBean o2) {
				return Integer.parseInt(o2.getRate())-Integer.parseInt(o1.getRate())==0?0:Integer.parseInt(o2.getRate())-Integer.parseInt(o1.getRate())>0?1:-1;
			}
		});
	}

	public static void sortAvg(List<Entry<String, Float>> c) {
		Collections.sort(c, new Comparator<Entry<String, Float>> () {

			@Override
			public int compare(Entry<String, Float> o1, Entry<String, Float> o2) {
				return o2.getValue()-o1.getValue()>0?1:-1;
			}
		});
	}

	public static void sortInteger(List<Entry<String, Integer>> b) {
		Collections.sort(b,new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1,
					Entry<String, Integer> o2) {
				return o2.getValue()-o1.getValue();
			}
		});
	}

}
