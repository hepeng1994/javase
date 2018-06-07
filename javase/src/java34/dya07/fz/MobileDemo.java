package java34.dya07.fz;

public class MobileDemo {
	public static void main(String[] args) {
		
		Mobile  me=new Mobile();
		me.setBrand("苹果");
		me.setPrice(7000);
		me.setType("iphone7");
		me.setColor("白色");
		
		Mobile  me1=new Mobile();
		me1.setBrand("华为");
		me1.setPrice(3000);
		me1.setType("荣耀X10");
		me1.setColor("黑色");

		Mobile  me2=new Mobile();
		me2.setBrand("小米");
		me2.setPrice(1999);
		me2.setType("米6");
		me2.setColor("银色");
		
		Mobile[] a=new Mobile[]{me,me1,me2};
		for(int i=0;i<a.length;i++){
		System.out.println("品牌:"+a[i].getBrand()+",颜色:"+a[i].getColor()+",价格:"+a[i].getPrice()+",型号:"+a[i].getType());
		}
	}

}
