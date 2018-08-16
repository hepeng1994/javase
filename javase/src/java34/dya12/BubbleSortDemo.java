package java34.dya12;

import java.util.Arrays;
import java34.Util.ArrayUtil;

public class BubbleSortDemo {
	public static void main(String[] args) {
		
	
		int [] arr=new int[]{24,10,15,50,70,30};
			/**for(int i=1;i<arr.length;i++){
				for(int j=0;j<arr.length-i;j++){
					if(arr[j]>arr[j+1]){
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;		
					}
				}
			}
			System.out.println(Arrays.toString(arr));*/
		
		
		System.out.println(Arrays.toString(ArrayUtil.bubbleSort(arr, true)));
		}
	}