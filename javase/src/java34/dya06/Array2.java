package java34.dya06;

public class Array2 {
	public static void main(String[] args) {
		String a="";
		int b =0;
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10;k++) {
					if(i*i*i+j*j*j+k*k*k==i*100+j*10+k){
						b=i*100+j*10+k;
						a+=String.valueOf(b)+",";
					}
				}
				
			}
			
		}
		System.out.println(a);
		
	}

}
