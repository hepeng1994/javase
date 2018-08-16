package java34.dya14.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
		Set<Map.Entry<K,V>> entrySet():  返回的是键值对对象的集合
		V get(Object key):   根据键获取值
		Set<K> keySet():    获取集合中所有键的集合
		Collection<V> values():   获取集合中所有值的集合
 * 
 *
 */

public class MapDemo1 {
	public static void main(String[] args) {
		
	////创建集合对象
	Map<String, String> map=new HashMap<String, String>();
	
	//创建元素并添加元素
	map.put("邓超", "孙俪");
	map.put("黄晓明", "杨颖");
	map.put("周杰伦", "蔡依林");
	map.put("刘恺威", "杨幂");
	
	//V get(Object key) 根据键获取值
	System.out.println(map.get("邓超"));//孙俪
	System.out.println(map.get("周杰"));// null
	
	//Set<k> keySet() 获取集合中所有的键的集合
	Set<String> set=map.keySet();
	System.out.println(set);
	for(String a:set){
		System.out.println(a+","+map.get(a));
	}
	
	//Collection<V> values():   获取集合中所有值的集合
	Collection<String> c=map.values();
	for(String b:c){
		System.out.println(b);
	}
	
	
	}
}
