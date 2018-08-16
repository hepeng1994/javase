package java34.dya13.collection.test;

import java.util.ArrayList;

public class ZuoYeTest {
	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		ArrayList a1=new ArrayList();
	
		a.add("我们");
		a.add("我们");
		a.add(1);
		a.add(15);
		a.add(15);
		
		for(int i=0;i<a.size();i++){
			if(!a1.contains(a.get(i))){
				a1.add(a.get(i));
			}
		}
		System.out.println(a1);
	}
}