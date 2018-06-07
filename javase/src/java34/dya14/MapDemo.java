package java34.dya14;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer, String> mp=new HashMap<>();
		mp.put(1, "李白坐船不要钱");
		mp.put(2, "老板一脚踢下船");
		mp.put(3, "辛亏李白会游泳");
		mp.put(4, "一游游到桃花潭");
		mp.put(5, "桃花潭水深千尺");
		mp.put(5, "不及强哥送我情");
		
		System.out.println(mp);
		
		System.out.println(mp.get(3));
		
		System.out.println(mp.remove(5));
		
		System.out.println(mp);
		
		System.out.println(mp.containsKey(2));
		System.out.println(mp.containsValue("bbb"));
		
		System.out.println(mp.size());
		
		mp.clear();
		System.out.println(mp);
	}

}
