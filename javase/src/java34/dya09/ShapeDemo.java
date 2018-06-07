package java34.dya09;

public class ShapeDemo {
	public static void main(String[] args) {
		Shape t=new Circle(10);
		//System.out.println(t.arse());
		//System.out.println(t.zhouChang());
		s(t);
		Shape h= new Rect(20,10);
		//System.out.println(h.arse());
		//System.out.println(h.zhouChang());
		s(h);
	}
	public static void s(Shape i){
		System.out.println("周长为:"+i.zhouChang());
		System.out.println("面积为:"+i.arse());
	}

}
abstract class Shape{
	abstract public double zhouChang();
	abstract public double arse();
	}

class Rect extends Shape{
	double width;
	double length;
	public Rect(double width,double length){
		this.width=width;
		this.length=length;
	}
	public Rect(){
		
	}
	@Override
	public double zhouChang() {
		return (width+length)*2;
	}
	@Override
	public double arse() {
			return width*length;
	}	
}
class Circle extends Shape{
	public static final double PI=3.14;
	double r;
	public Circle(double r){
		this.r=r;
	}
	public Circle(){
		
	}
@Override
	public double zhouChang() {	
		return 2*PI*r ;
}
@Override
	public double arse() {	
		return PI*r*r;
}
}