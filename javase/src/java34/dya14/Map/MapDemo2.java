package java34.dya14.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 
 *  int size()：  返回集合中的键值对的对数
 *
 */

public class MapDemo2 {
	public static void main(String[] args) {
		//创建对象
		Map<String, String> map=new HashMap<String, String>();
		//创建元素
		map.put("杨过", "小龙女");
		map.put("郭靖", "黄蓉");
		map.put("杨康", "穆念慈");
		map.put("陈玄风", "梅超风");
		
		//遍历
		//获取所有键  A:键找值
        //a:获取所有键的集合
        //b:遍历键的集合,得到每一个键
        //c:根据键到集合中去找值
		Set<String> s = map.keySet();
		for(String a:s){
			String values=map.get(a);
			System.out.println(a+"--"+values);
		}
		System.out.println("---------------------------");
		Set<Entry<String,String>> set = map.entrySet();
		for(Entry<String,String> a:set){
			System.out.println(a.getKey()+","+a.getValue());
		}
		System.out.println("----------------------------------");
		Iterator<Entry<String, String>> it = set.iterator();
		while(it.hasNext()){
			Entry a=it.next();
					System.out.println(a.getKey()+","+a.getValue());
		}
		System.out.println("-------------------------------");
		Collection<String> v = map.values();
		for(String a:v){
			System.out.println(a);
		}
	}

}


