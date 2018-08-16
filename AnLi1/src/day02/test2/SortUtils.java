package day02.test2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortUtils {

	public static void values(List<String> list) {
		Collections.sort(list,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o2.compareTo(o1);
			}
		});
		
	}

}
