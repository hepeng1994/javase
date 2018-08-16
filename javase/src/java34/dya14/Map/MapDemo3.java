package java34.dya14.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapDemo3 {
	/**B:键值对对象找键和值
   	a:获取所有的键值对对象的集合
   b:遍历键值对对象的集合，获取每一个键值对对象
   	c:根据键值对对象去获取键和值
 * 
 */
public static void main(String[] args) {
	Map<String, String> map=new HashMap<>();
	
	map.put("杨过", "小龙女");
	map.put("郭靖", "黄蓉");
	map.put("杨康", "穆念慈");
	map.put("陈玄风", "梅超风");
	
	Set<Entry<String,String>> set = map.entrySet();
		for(Entry<String,String> a:set){
			System.out.println(a.getKey()+","+a.getValue());
			}
	System.out.println("--------------------------");
	Set<String> set2 = map.keySet();
		for(String a:set2){
			System.out.println(a+","+map.get(a));
		}
		System.out.println("------------------------------");
		Iterator<Entry<String, String>> it = set.iterator();
		while(it.hasNext()){
			Entry a=it.next();
			System.out.println(a.getKey()+","+a.getValue());
		}
		Collection<String> va = map.values();
		for(String b:va){
			System.out.println(b);
		}
	}
}
