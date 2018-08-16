package java34.dya.lianXiTi;

import java.util.LinkedList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List<PersonDemo> list=new LinkedList<>();
		
		list.add(new PersonDemo("你",25,'男'));
		list.add(new PersonDemo("我",28,'男'));
		list.add(new PersonDemo("他",20,'女'));
		list.add(new PersonDemo("你",25,'男'));
		
		List<PersonDemo> l=distinct(list);
		System.out.println(l);
		
		
	}
	public static List<PersonDemo> distinct(List<PersonDemo> list){
		List<PersonDemo> l=new LinkedList<PersonDemo>();
		if(list!=null&&list.size()>0){
			for(int i=0;i<list.size();i++){
				if(!l.contains(list.get(i))){
					l.add(list.get(i));
				}
			}
		}
		return l;
	}
}
