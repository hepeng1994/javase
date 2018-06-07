package java34.dya14;

import java.util.ArrayList;
import java.util.Collection;

public class GenericDemo {
	public static void main(String[] args) {
		Collection<?> c1=new ArrayList<a>();
		Collection<?> c2=new ArrayList<b>();
		Collection<?> c3=new ArrayList<c>();
		//泛型里 extends 向下转
		Collection<? extends a> c4=new ArrayList<a>();
		Collection<? extends a> c5=new ArrayList<b>();
		Collection<? extends a> c9=new ArrayList<d>();
		//泛型里 super 向上转
		Collection<? super c> c6=new ArrayList<a>();
		Collection<? super c> c7=new ArrayList<Object>();
		Collection<? super d> c8=new ArrayList<b>();
		
	}

}
class a{}
class  b extends a {}
class  c extends a{}
class d extends b{}
