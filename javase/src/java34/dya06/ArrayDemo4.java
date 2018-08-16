package java34.dya06;

public class ArrayDemo4 {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6};
		
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
