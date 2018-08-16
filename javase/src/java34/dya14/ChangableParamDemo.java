package java34.dya14;

public class ChangableParamDemo {
	public static void main(String[] args) {
		System.out.println(getSum(1,2,4,5));
		System.out.println(getSum(1,3,5,6,8,9));
		
	}
	public static int getSum(int b,int c, int...d){
		int sum=0;
		if(d!=null&&d.length>0){
			for(int i:d){
				sum+=i;
			}
		}
		return sum;
	}
}
