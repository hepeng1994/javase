package java34.dya14.List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		
		arr.add("Hello");
		arr.add("world");
		arr.add("java");
		arr.add("Hello");
		arr.add("world");
		arr.add("java");
		
		/*ArrayList a=new ArrayList();
		
		Iterator it= arr.iterator();
		while(it.hasNext()){
			String b=(String)it.next();
			if(!a.contains(b)){
				a.add(b);
			}
		}
		for(int i=0;i<a.size();i++){
			System.out.println(a.get(i));
		}
		for(int i=0;i<arr.size()-1;i++){
			for(int j=i+1;j<arr.size();j++){
				if(!a.contains(arr.get(i))){
					a.add(arr.get(i));
				}
			}
		}
		System.out.println(a);*/
		
		for(int i=0;i<arr.size()-1;i++){
			for(int j=i+1;j<arr.size();j++){
				if(arr.get(i).equals(arr.get(j))){
					arr.remove(j);
					j--;
				}
			}
		}
		Iterator i= arr.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
	}

}
