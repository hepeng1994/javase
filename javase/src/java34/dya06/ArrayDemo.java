package java34.dya06;

public class ArrayDemo {
	public static void main(String[] args) {
		
		int[] arr=new int[5];
		arr [3]=100;
		arr [2]=90;
		int[] arr1=new int[4];
		arr1[1] = 12;
		arr1[3] = 11;
		System.out.println(arr);
		System.out.println(arr1[3]);
		arr = arr1;
		arr1[2] = 15;
		arr1[3] = 18;
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
	}

}
