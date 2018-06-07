package java34.dya04;

import java.util.Scanner;

public class CustmerTest {
	public static void main(String[] args) {
		//接收用户从终端输入的信息
		Scanner scn=new Scanner(System.in);
		System.out.println("请输入第一个客户信息");
		String line1=scn.nextLine();
		//字符串切割
		String[] split1=line1.split(",");
		
		System.out.println("请输入第二个客户信息");
		String line2=scn.nextLine();
		String[] split2=line2.split(",");
		
		System.out.println("请输入第三个个客户信息");
		String line3=scn.nextLine();
		String[] split3=line3.split(",");
		
		Custmer c1=new Custmer(split1[0],split1[1],Integer.parseInt(split1[2]),split1[3],split1[4],split1[5]);
		Custmer c2=new Custmer(split2[0],split2[1],Integer.parseInt(split2[2]),split2[3],split2[4],split2[5]);
		Custmer c3=new Custmer(split3[0],split3[1],Integer.parseInt(split3[2]),split3[3],split3[4],split3[5]);
	
		int sum=c1.age+c2.age+c3.age;
		float a=(float)sum/3;
		
		Custmer[] cs=new Custmer[]{c1,c2,c3};
		int tmp=cs[0].age;
		for(int i=1;i<3;i++){
			if(cs[i].age>tmp){
				tmp=cs[i].age;
			}
		}
		System.out.println(a);
		System.out.println(tmp);
	}

}
