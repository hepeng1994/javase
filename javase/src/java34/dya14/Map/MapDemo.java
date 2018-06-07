package java34.dya14.Map;

import java.util.HashMap;
import java.util.Map;

/**
			   			(3)Map接口功能概述
		 1:添加功能
			V put(K key,V value):添加元素。这个其实还有另一个功能?先不告诉你，等会讲
			如果键是第一次存储，就直接存储元素，返回null
			如果键不是第一次存在，就用值把以前的值替换掉，返回以前的值
		 2:删除功能
			void clear(): 移除所有的键值对元素
			V remove(Object key)： 根据键删除键值对元素，并把值返回
		3:判断功能
			boolean containsKey(Object key)：      判断集合是否包含指定的键
			boolean containsValue(Object value):   判断集合是否包含指定的值
			boolean isEmpty()：                          判断集合是否为空
 * @author ASUS
 *
 */

public class MapDemo {
	public static void main(String[] args) {
		
		//创建集合对象
		Map<String, String> map=new HashMap<String, String>();
		//添加元素 
		// v put(k key, v value)
		map.put("邓超", "孙俪");
		map.put("黄晓明", "杨颖");
		map.put("周杰伦", "蔡依林");
		map.put("刘恺威", "杨幂");
		
		// void clear移除元素所有元素
		//System.out.println(map);
		//map.clear();
		//System.out.println(map);
		
		//v remove(Object key)根据键删除值对的元素，并把值返回
		System.out.println(map.remove("邓超"));
		
		//boolean containsKey(Object key)：      判断集合是否包含指定的键
		System.out.println(map.containsKey("黄晓明"));
		
		//boolean containsValue(Object value):   判断集合是否包含指定的值
		System.out.println(map.containsValue("杨幂"));
		
		//boolean isEmpty()：     判断集合是否为空
		System.out.println(map.isEmpty());
		
		//int size()：返回集合中的键值对的对数
		System.out.println(map.size());
		
	}

}
