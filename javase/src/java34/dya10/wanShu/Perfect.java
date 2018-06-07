package java34.dya10.wanShu;

public class Perfect extends Number {
	@Override
	public void method() {
		 
	for(int i=2;i<1000;i++){
		int sum=0;
		for(int j=1;j<i;j++){
			if(i%j==0){
				sum +=j;
			}
	}
		if(sum==i){
			System.out.println(i);
}
	}		
	}
}
	

