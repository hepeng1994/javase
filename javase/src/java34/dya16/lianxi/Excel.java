package java34.dya16.lianxi;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import java34.dya03.LikeEatingSnakeDemo;

public class Excel {
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		
		Random a=new Random();
		
		while(set.size()!=6){
			int b=a.nextInt(33)+1;	
			set.add(b);
	}
		int c=a.nextInt(16)+1;
		System.out.println(set);
		System.out.println(c);
	}

}
