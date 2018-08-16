package dayzixi.dianying;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;

public class Movie {

	public static void utilsValue(List<MovieBean> value) {
		Collections.sort(value, new Comparator<MovieBean>() {
			@Override
			public int compare(MovieBean o1, MovieBean o2) {
				return o2.rate-o1.rate;
			}
		});
	}

	public static float utilsAvg(List<MovieBean> value) {
		float sum=0;
		for (MovieBean movieBean : value) {
			sum=sum+movieBean.rate;
		}
		float avg =sum/value.size();
		return avg;
	}

	public static void utilsInteger(List<Entry<String, Float>> c) {
		Collections.sort(c,new Comparator<Entry<String, Float>>() {

			@Override
			public int compare(Entry<String, Float> o1, Entry<String, Float> o2) {
				return o2.getValue()-o1.getValue()>0?1:-1;
			}
		});
	}

	public static void utilsSort(List<Entry<String, Integer>> d) {
		Collections.sort(d,new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1,
					Entry<String, Integer> o2) {
				return o2.getValue()-o1.getValue();
			}
		});
		
	}

}
