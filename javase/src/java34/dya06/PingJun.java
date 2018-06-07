package java34.dya06;

public  class PingJun{

public static double arr(int[]arr){
	double temp=0;
     for(int i=0;i<arr.length;i++){
     temp+=arr[i];
}
    double b=temp/arr.length; 
     return b;
}
public static void main(String[]args){
   int[] arr=new int[]{1,2,3,4,5,6};
   double a=arr(arr);
    System.out.println("平均值为："+a);
} 
}




