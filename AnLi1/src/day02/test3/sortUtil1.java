package day02.test3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sortUtil1 {

	public static void sortByvalue(List<String> list) {
		Collections.sort(list,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		
	}

}
