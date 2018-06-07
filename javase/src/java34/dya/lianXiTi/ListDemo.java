package java34.dya.lianXiTi;

import java.util.List;
import java.util.ArrayList;

public class ListDemo {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		
		list.add("郑贵强");
		list.add("郑贵强");
		list.add("张彬");
		list.add("郑贵强");
		list.add("腾飞");
		List<String> l=distinct(list);
		System.out.println(l);
	}
	public static List<String> distinct(List<String> list){
		List<String> l=new ArrayList<>();
		for(int i=0;i<list.size();i++){
			if(!l.contains(list.get(i))){
				l.add(list.get(i));
			}
		}
		return l;
	}
}
