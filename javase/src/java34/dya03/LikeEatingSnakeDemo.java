package java34.dya03;

import java.util.Scanner;

public class LikeEatingSnakeDemo {
	
	public static void main(String[] args) {
		Scanner scn=  new Scanner(System.in);
		System.out.println("欢迎来到贪吃蛇，游戏即将开始，请做好准备");
		System.out.println("请输入你的操作：，、<1:吃到食物；非1：撞墙");  
		int result =scn.nextInt();
		 
		 int a =0;
		  while(result==1){
			  a +=10;
			  result =scn.nextInt();
			
		  }
		  System.out.println("游戏结束"+a);
		 
	}

}
