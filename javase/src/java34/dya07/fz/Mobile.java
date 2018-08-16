package java34.dya07.fz;

public class Mobile {
	
	
	private  String brand;
	private  String type;
	private  double price;
	private  String color;
	
	public String getBrand(){
		return  brand;
	}
	public  void  setBrand(String brand){
		this.brand=brand;
	}
	
	public String getType(){
		return  type;
	}
	public  void  setType(String type){
		this.type=type;
	}
	
	public double getPrice(){
		return  price;
	}
	public  void  setPrice(double price){
		this.price=price;
	}
	
	public String getColor(){
		return  color;
	}
	public  void  setColor(String color){
		this.color=color;
	}
	
	public void a(){
		System.out.println("品牌:"+brand+",型号:"+type+",价格:"+price+",颜色:"+color);
	}
	public Mobile(){}
	
	public Mobile(String brand,String type,double price, String color){
		this.brand=brand;
		this.type=type;
		this.price=price;
		this.color=color;
		
	}
	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.brand="苹果";
		m.type="iphone7";
		m.price=7000;
		m.color="土豪金";
		
		Mobile m1=new Mobile();
		m1.setBrand("小米");
		m1.setType("米6");
		m1.setPrice(1999);
		m1.setColor("白色");
		
		Mobile m2=new Mobile("华为","x10",3000,"黑色");
		
		m.a();
		m1.a();
		m2.a();
	}	
	

}
