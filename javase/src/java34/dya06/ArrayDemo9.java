package java34.dya06;

import java.util.Scanner;
import java34.Util.ArrayUtil;

public class ArrayDemo9 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int[] arr={1,2,3,4,5,6};
		int index=ArrayUtil.index(arr, num);
		if(index<0){
			System.out.println("你输入的元素值有无误");
		}else {
			System.out.println("你输入的元素索引值为："+index);
		}
		
	}
	

}
		