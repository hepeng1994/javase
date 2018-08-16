package java34.dya08;

public class Rect {
	
	public double width;
	public double height;
	
	public Rect(double width,double height){
		this.width=width;
		this.height=height;
	}
	public Rect(){
		 width=10;
			height=10;
	}
	public double area(){
		return width*height;
	}
	public double perimter(){
		return (width+height)*2;
	}
}
class PlainRect extends Rect{
	
	double startX;
	double startY;
	
	public PlainRect(double width,double height,double startX,double startY ){
		this.width=width;
		this.height=height;
		this.startX=startX;
		this.startY=startY;
	}
	public PlainRect(){
		this.width=0;
		this.height=0;
		this.startX=0;
		this.startY=0;
	}
	
	public boolean isInside(double x,double y){
		return  x>=startX&&x<=(startX+width)&&y<startY&&y>=(startY-height);
	}
}


