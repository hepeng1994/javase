package java34.dya16.lianxi;

public class DiGui {
	public static void main(String[] args) {
		System.out.println(d(10));
	}
	public static int d(int a){
		if(a==1||a==2){
			return 1;
		}else{
			return d(a-1)+d(a-2);
		}
	}
}
