package java34.dya06;


public class Array1 {
	public static void main(String[] args) {
		for(int i=100;i<1000;i++){
			int a=i%10;
			int b=i/10%10;
			int c=i/100;
			if(i==a*a*a+b*b*b+c*c*c){
				System.out.println(i);
			}
		}
	}

}
