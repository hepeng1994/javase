package dayzixi.liulaing;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;

public class utils {

	public class geohash {

	}

	public static void sort(List<Entry<String, Long>> c) {
		Collections.sort(c, new Comparator<Entry<String, Long>>() {

			@Override
			public int compare(Entry<String, Long> o1, Entry<String, Long> o2) {
				return o2.getValue()-o1.getValue()>0?1:-1;
			}
		});
	}

}
