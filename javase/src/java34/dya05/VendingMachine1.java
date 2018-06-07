package java34.dya05;

import java.util.Scanner;

/**
 * 6.自动售货机
	需求：
	屏幕显示：请选择您要购买的商品编号1：雪碧(3元) 2：矿泉水(2元) 3:红牛(6元)
	用户输入编号后，屏幕显示请输入金额，用户输入金额
	结果：
	如果购买成功输出：您购买的商品*，价格*，实收*，找零*，谢谢惠顾！
	如果购买失败输出：对不起您的金额不足！
 */
public class VendingMachine1 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("选择您要购买的商品编号1：雪碧(3元) 2：矿泉水(2元) 3:红牛(6元)");
		int a=scn.nextInt();
		if(a<1|a>3){
			System.out.println("该商品不存在");
			return;
		}
		System.out.println("输入金额");
		int b=scn.nextInt();
		mony1(a,b);
		
	}
	public static  String goods(int a){
		if(a==1){
			return "雪碧(3元)";
		}else if(a==2){
			return "矿泉水(2元)";
		}else if(a==3){
			return "红牛(6元)";
		}else{
			return "你输入的商品有误";
		}
	}
	public static int mony(int a){
		int c=0;
		if(a==1){
			c=3;
		}else if(a==2){
			c=2;
		}else if(a==6){
			c=6;
		}
		return c;
	}
	public static void mony1(int a,int b){
		
		if(b>mony(a)){
			System.out.println("你所购买的商品是:"+goods(a)+"找零"+(b-mony(a)));
		}
	}
	
}
