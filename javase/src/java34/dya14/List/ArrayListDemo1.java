package java34.dya14.List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		ArrayList<Student> arr=new ArrayList<>();
		
		arr.add(new Student("武松",30));
		arr.add(new Student("鲁智深",40));
		arr.add(new Student("林冲",36));
		arr.add(new Student("杨志",38));
		
		Iterator<Student> it = arr.iterator();
		while(it.hasNext()){
			Student a=it.next();
			System.out.println(a.name+","+a.age);
		}
		System.out.println("--------------------------");
		
		for(int i=0;i<arr.size();i++){
			System.out.println(arr.get(i).name+","+arr.get(i).age);
		}
	}
}
