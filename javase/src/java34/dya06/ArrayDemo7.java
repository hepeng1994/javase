package java34.dya06;

public class ArrayDemo7 {
	public static void main(String[] args) {
		
	
	int [] arr=new int[]{1,0};
	int a=arr[0];
	arr[0]=arr[1];
	arr[1]=a;
	System.out.println(arr[0]);
	System.out.println(arr[1]);
}
}