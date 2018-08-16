package java34.dya04;

public class ZuoYe {
		public static void main(String[] args) {
		//	求1~100之间不能被3整除的数之和
		/*int a=0;
		for(int i=0;i<=100;i++){
			if(i%3!=0){
				a+=i;
			}
		}
			System.out.println(a);*/
		int i=0;
		int a=0;
		while (i<=100){
			if(i%3!=0){
				a+=i;
			}i++;
		}System.out.println(a);
}
}
