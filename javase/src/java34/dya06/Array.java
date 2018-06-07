package java34.dya06;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入你准备打印的是一个多少行的杨辉三角：");
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		
		for(int x=0; x<n; x++) {
			arr[x][0] = 1;
			arr[x][x] = 1;
		}
		
		//第三行开始
		for(int x=2; x<n; x++) {
			//第二列开始,一定要记得减去最后一列
			for(int y=1; y<=x-1; y++) {
				arr[x][y] = arr[x-1][y-1]+arr[x-1][y];
			}
		}
		
		System.out.println("-----------------------");
		//输出的时候，千万要和九九乘法表的输出类似。
		for(int x=0; x<arr.length; x++) {
			for(int y=0; y<=x; y++) {
				System.out.print(arr[x][y]+"\t");
			}
			System.out.println();
		}
	}

}
