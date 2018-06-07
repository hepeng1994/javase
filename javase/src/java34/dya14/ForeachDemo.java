package java34.dya14;

import java.util.ArrayList;
import java.util.Collection;

public class ForeachDemo {
	public static void main(String[] args) {
		int [] a={13,15,12,18,19};
		
		for(int b:a){
			System.out.println(b);
		}
		
		Collection c=new ArrayList();
		
		c.add("zgq");
		c.add("zb");
		c.add("hp");
		for(Object d:c){
			System.out.println(d);
		}
	}

}
