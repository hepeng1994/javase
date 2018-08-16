package java34.dya20.kaoshi;

import java34.Util.ArrayUtil;

public class ErFen {
	public static void main(String[] args) {
		int[] a=new int []{1,2,3,4,5,6,7,8,9};
		ArrayUtil.bubbleSort(a, false);
		int b=10;
		int start=0;
		int end=a.length-1;
		int c=-1;
		while(start<=end){
			int middle=(start+end)/2;
			if(a[middle]==b){
				c=middle;
				break;
			}else if(a[middle]>b){
				if(a[0]<a[a.length-1]){
					end=middle-1;
				}else{
					start=middle+1;
				}
			}else {
				if(a[0]<a[a.length-1]){
					start=middle+1;
				}else{
					end=middle-1;
				}
			 }
		}
		if(start>end){
			System.out.println("你查找的数有误");
		}else{
			System.out.println(c);
			}
		ArrayUtil.ErFen1(a,10);
	}
}
