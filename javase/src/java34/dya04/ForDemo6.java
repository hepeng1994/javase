package java34.dya04;

public class ForDemo6 {
	public static void main(String[] args) {
		int a=0;
		int b=0;
		for(int i=1;i<=100;i++){
			if(i%2==0){
				a+=i;
			}else 
				b+=i;	
		}
		System.out.println(a);
		System.out.println(b);
}
}