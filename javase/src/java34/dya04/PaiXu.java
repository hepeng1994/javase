package java34.dya04;

import java.util.Scanner;

public class PaiXu {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int[] b= new int[5];
		for(int i=0;i<5;i++){
			String line=scn.nextLine();
			b[i]=Integer.parseInt(line);
		}
		for(int j=0;j<b.length-1;j++){
		for(int i=0;i<b.length-1-j;i++){
			
			if(b[i]<b[i+1]){
				int tmp=b[i];
				b[i]=b[i+1];
				b[i+1]=tmp;
		
			}
		}
	}
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
}
}