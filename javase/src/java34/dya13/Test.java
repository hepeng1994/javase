package java34.dya13;

import java.util.Arrays;

import java34.Util.ArrayUtil;

public class Test {
	public static void main(String[] args) {
		String a="24 3 15 75 30";
		String[] a1=a.split(" ");
		int [] c=new int[a1.length];
		for(int i=0;i<a1.length;i++){
		c[i]=Integer.valueOf(a1[i]);
		}
			ArrayUtil.bubbleSort(c, true);
		
		/*for(int i=0;i<c.length;i++){
			String ss=String.valueOf(c[i]);
			System.out.print(ss+" ");
		}*/
		
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<c.length;i++){
			sb.append(c[i]).append(" ");
		}
		System.out.println(sb.toString().trim());
	}

}
