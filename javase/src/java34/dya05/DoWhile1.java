package java34.dya05;

public class DoWhile1 {
	public static void main(String[] args) {
		int a=0;
		int b=0;
		int i=1;
		do{
			if(i%2==0){
				a+=i;
			}
			if(i%2!=0){
				b+=i;
			}
			i++;
		}while(i<=100);
		System.out.println("偶数和为"+a);
		System.out.println("奇数和为"+b);
	}

}
