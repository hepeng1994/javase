package java34.dya07;

import java34.Util.ArrayUtil;

public class ParamDemo {
	public static void main(String[] args) {
		int a=20;
		int b=30;
		change(a,b);//参数是基本类型，形参的改变不影响实参的值，所以a和b的值都不变，change方法改了以后没有任何影响，因为方法结束后就消失了
		System.out.println(a);
		System.out.println(b);
		
		int []arr={1,2,3,4,5,6,7};
		arr(arr,3,5);//参数是数组，是引用类型的参数，形参的改变影响实参的值，因为传的是地址值，形参和实参执行同一片空间，一个改变了，另一个也改了
		ArrayUtil.arr(arr);
	}
	public static void change(int a,int b){
		a=100;
		b=300;
	}
	public static void arr(int[]arr,int x,int y){
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
}
