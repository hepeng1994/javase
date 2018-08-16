package java34.dya14;

import java.util.LinkedHashSet;
import java.util.Random;

public class SetTest {
	public static void main(String[] args) {
		LinkedHashSet<Integer> set= new LinkedHashSet<Integer>();
		
		Random d=new Random();
		while(set.size()!=6){
			int a=d.nextInt(33)+1;
			set.add(a);
		}
		int c=d.nextInt(16)+1;
		System.out.println(set);
		System.out.println(c);
	}

}
