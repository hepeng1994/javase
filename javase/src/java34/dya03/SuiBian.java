package java34.dya03;

import java.util.Scanner;

public class SuiBian {
 public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("请输入数值");
	int[] arr= new int[5];
	
	 for(int i=0;i<5;i++){
		 
		 arr[i]=scn.nextInt();
	 }
	 
	 int tmp=arr[0];
	 for(int i=0;i<5;i++){
		 if(arr[i]<tmp){
			tmp=arr[i];
		 }
		 
		
	 }
	 
	 System.out.println(tmp);
}
}
