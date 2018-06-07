package java34.dya08;

public class Dog {
	public static void main(String[] args) {
		Doga a=new Doga();
		System.out.println(a.color);
	}
	

}
class  Dogs{
	String pinzh;
	String color;
	char  sex;
	
	public void eat(){
		System.out.println("吃");	
	}
}
class Doga extends Dogs{
	double price;
	
	public void yaoRen() {
		System.out.println("咬人");
	}
}
