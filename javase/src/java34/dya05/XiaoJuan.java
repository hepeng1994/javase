package java34.dya05;

public class XiaoJuan {
	public static void main(String[] args) {
		int a=0;
		int b=0;
		while(a<100){
			a+=3;
			b++;
			if(b%6==0){
				a-=5;
			}
			
		}
		System.out.println(b);
	}

}
