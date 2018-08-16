package java34.dya05;

public class ChengFa {
	public static void main(String[] args) {
		/*for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"X"+i+"="+(j*i)+"  ");
			}
			System.out.println();
		}*/
		int i=1;
		while(i<=9){
			int j=1;
			while(j<=i){
			System.out.print(j+"X"+i+"="+(j*i)+"  ");
			j++;
			}
			System.out.println();
			i++;
		}
	}

}
