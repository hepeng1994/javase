package java34.dya14;

import java.util.Arrays;

public class ShuZu {
	public static void main(String[] args) {
		int [] a={1,5,9,7,6,3,4};
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++){
			if(i==0){
				System.out.print("["+a[i]+",");
			}else if(i==a.length-1){
				System.out.println(a[i]+"]");
			}else {
				System.out.print(a[i]+",");
			}
		}
		System.out.println("--------------------------------");
		for(int i=1;i<a.length;i++){
			for(int j=0;j<a.length-i;j++){
				if(a[j]<a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("----------------------------------");
		int start=0;
		int end=a.length-1;
		int b=-1;
		int c=3;
		while(start<=end){
			int	middle=(start+end)/2;
			if(a[middle]==c){
				b=middle;
				break;
			}else if(a[middle]<c){
				if(a[0]>a[a.length-1]){
					end=middle-1;
				}else{
					start=middle+1;
				}
			}else{
				if(a[0]<a[a.length-1]){
					end=middle-1;
				}else{
					start=middle+1;
				}
			}
		}
		if(start>end){
			System.out.println("你查找的数字有误");
		}else{
			System.out.println(b);
		}
		System.out.println("-----------------------------------");
		for(int i=0;i<a.length/2;i++){
			int temp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-i-1]=temp;
			
		}
		System.out.println(Arrays.toString(a));
		System.out.println("------------------------------------");
		System.out.println(Arrays.binarySearch(a,6));
		
		String d="123456";
		StringBuffer be=new StringBuffer(d);
		System.out.println(be.reverse());
		int [] e={2,3,9,8,5};
		Arrays.sort(e);
		System.out.println(Arrays.toString(e));
	}
}
