package java34.dya05;
/**
 * 6.自动售货机
	需求：
	屏幕显示：请选择您要购买的商品编号1：雪碧(3元) 2：矿泉水(2元) 3:红牛(6元)
	用户输入编号后，屏幕显示请输入金额，用户输入金额
	结果：
	如果购买成功输出：您购买的商品*，价格*，实收*，找零*，谢谢惠顾！
	如果购买失败输出：对不起您的金额不足！
 */
import java.util.Scanner;

public class VendingMachine {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("请选择你需要购买的商品：1：雪碧(3元) 2：矿泉水(2元) 3:红牛(6元)");
		int a=scn.nextInt();
		System.out.println(goods(a));
		System.out.println("请输入金额");
		int b=scn.nextInt();
		mony(a,b);
	}
	//商品名
	public static  String goods(int a){
		if(a==1){
			return "雪碧（3元）";
		}else if(a==2){
			return "矿泉水(2元)";
		}else if(a==3){
			return "红牛(6元)";
		}else{
			return "你选择的商品有误";
		}
	
	   
	}
	//确定商品相对应的价格
	public static int mony(int a){
		int c=0;
		if(a==1){
			c=3;
		}else if(a==2){
			c=2;
		}else if(a==3){
			c=6;
		}
		return c;	
	}
	//商品金额找零
	public static void mony(int a,int b){
		int c;
		if(b>=mony(a)){
			c=b-mony(a);
			System.out.println("你所购买的商品是:"+goods(a)+"找零"+c+"元");
		}else{
			System.out.println("你输入的金额不足");
		}
	}
	
	}

