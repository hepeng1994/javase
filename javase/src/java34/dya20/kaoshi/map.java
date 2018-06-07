package java34.dya20.kaoshi;

import java.util.HashMap;
import java.util.Set;

public class map {
	public static void main(String[] args) {
		HashMap<String,String> map=new HashMap<>();
		map.put("a", "b");
		Set<String> set = map.keySet();
		for(String c:set){
			System.out.println(c+","+map.get(c));
		}
	}
}
