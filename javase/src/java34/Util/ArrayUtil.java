
package java34.Util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * 使用不同类的方法，记得要导包！！！！！！！！
 * @author ASUS
 *
 */
public class ArrayUtil {
	
	
		//打印数组，如[1,2,3,4,5]
	public static void  arr(int arr []){
		for(int i=0;i<arr.length;i++){
			if(arr.length==1){
				System.out.println("["+arr[0]+"]");
			}else if(i==0){
				System.out.print("["+arr[0]+",");
			}else if(i==arr.length-1){
				System.out.print(arr[i]+"]");
			}else{
				System.out.print(arr[i]+",");
			}

		}
	}
//----------------------------------------------------------------------------------
	
		//求数组最大，最小值
	public static void arrMaxAndMin(int[] arr){
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[0]<arr[i]){
				max=arr[i];
				}
			if(arr[0]>arr[i]){
				min=arr[i];
				}
			}
			System.out.println("最大值为："+max);
			System.out.println("最小值为："+min);
		}
//-------------------------------------------------------------------------------------	
	
	//数组逆序第一种方法
	public static int[] reverse	(int[]arr){
		for(int i=0;i<arr.length/2;i++){
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
			}
		return arr;
		}
//-----------------------------------------------------------------------------------------	
	
	//数组逆序第二种方
	public static int[] reverse1(int[]arr){
		for(int start=0,end=arr.length-1;start<end;start++,end--){
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
		}
		return arr;
	}
//-------------------------------------------------------------------------------------------	
	//查找数组中的元素索引值
	
	public static int  index(int []arr,int num){
		 int index=-1;
		 for(int i=0;i<arr.length;i++){
			 if(num==arr[i]){
				 index=i;
				 break;
			 }
		 }
		 return index;
	}


//---------------------------------------------------------------------------------------
	//数组的升序和降序     sort：排序
	public static void sort(int[]arr,boolean a){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]&a==true){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				if(arr[i]<arr[j]&a==false){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			
			}	
		}
		System.out.println(Arrays.toString(arr));
	}


//------------------------------------------------------------------------
		////数组的升序和降序     Bubble：冒泡
	public static int []   bubbleSort(int[]arr,boolean a){
		for(int i=1;i<arr.length;i++){
			for(int j=0;j<arr.length-i;j++){
				if(arr[j]>arr[j+1]&a==true){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;		
				}
				if(arr[j]<arr[j+1]&a==false){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;		
				}
			}
		}
	return arr;
	}



//-------------------------------------------------------------------------------
	//二分查找数组索引值方法
	public static void ErFen1(int[]a,int b){
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
				if(a[0]>a[a.length-1]){
					end=middle-1;
				}else{
					start=middle+1;
				}
			}
		}
		if(start>end){
			System.out.println("你查找的数有误");
		}else{
			System.out.println(c);
		}
	}
//----------------------------------------------------------

}
