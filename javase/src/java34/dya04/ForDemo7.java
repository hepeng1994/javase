package java34.dya04;

class ForDemo7 {
	public static void main(String[] args) {
		int a=0;
		int b=0;
		int c=0;
		for(int i=1;i<=1000;i++){
			if(i%3==2){
				a+=1;
			}
			if(i%5==3){
				b+=1;	
			}
			if(i%7==2){
				c+=1;
			}
	}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}
}