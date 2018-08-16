package day02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class SortUtil {

	public static void sortByVersons(List<String> value) {
		Collections.sort(value,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		
	}

	public static void sortByappBean(List<AppBean> d) {
		Collections.sort(d ,new Comparator<AppBean>() {

			@Override
			public int compare(AppBean o1, AppBean o2) {
				String date = o1.getDate();
				String date2 = o2.getDate();
				SimpleDateFormat a =new SimpleDateFormat("yyyy-MM-dd");
				try {
					Date parse = a.parse(date);
					Date parse2 = a.parse(date2);
					return parse.after(parse2)?1:-1;
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return 0;
			}
		});
		
	}
	
}
