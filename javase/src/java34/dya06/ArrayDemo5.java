package java34.dya06;

public class ArrayDemo5 {
	public static void main(String[] args) {
		int[] arr1={1,2,3,4,5,6,7,8,9};
		arr(arr1);
	
		
	}
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
}