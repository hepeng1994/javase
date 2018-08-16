package java34.dya14.List;

import java.util.ArrayList;
import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		
		Random r=new Random();
		
		ArrayList<Integer> a=new ArrayList<>();
		
		int b=0;
		
		while(b<7){
			int c=r.nextInt(33)+1;
			if(!a.contains(c)){
				a.add(c);
				b++;
			}
		}
		for(Integer d:a){
			System.out.println(d);
		}
	}

}
