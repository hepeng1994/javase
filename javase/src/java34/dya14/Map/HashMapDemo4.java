package java34.dya14.Map;
/**
 *    为了更符合要求：
 *          这次的数据就看成是学生对象。
 *          bj    北京校区
 *                 jc     基础班
 *                               林青霞           27
 *                               风清扬           30
 *                 jy    就业班   
 *                               赵雅芝           28
 *                               武鑫              29
 *          sh    上海校区
 *                 jc     基础班
 *                               郭美美           20
 *                               犀利哥           22
 *                 jy    就业班   
 *                               罗玉凤           21
 *                               马征              23
 *          gz    广州校区
 *                 jc     基础班
 *                               王力宏           30
 *                               李静磊           32
 *                 jy    就业班   
 *                               郎朗              31
 *                               柳岩              33
 *          xa    西安校区
 *                 jc     基础班
 *                               范冰冰           27
 *                               刘意              30
 *                 jy    就业班   
 *                               李冰冰           28
 *                               张志豪           29
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo4 {
	public static void main(String[] args) {
		
		//创建大集合
		HashMap<String, HashMap<String,ArrayList<Student>>> a=new HashMap<>();
		
		//北京校区数据
		HashMap<String,ArrayList<Student>> b=new HashMap<>();
		
		ArrayList<Student> c =new ArrayList<>();
		c.add(new Student("林青霞",27));
		c.add(new Student("风清扬",30));
		
		ArrayList<Student> c1 =new ArrayList<>();
		c1.add(new Student("赵雅芝",28));
		c1.add(new Student("武鑫",30));
		
		b.put("基础班", c);
		b.put("就业班", c1);
		
		a.put("北京校区", b);
		
		//上海校区
		HashMap<String,ArrayList<Student>> b1=new HashMap<>();
		
		ArrayList<Student> d=new ArrayList<>();
		d.add(new Student("郭美美",20));
		d.add(new Student("犀利哥",22));
		
		ArrayList<Student> d1=new ArrayList<>();
		d1.add(new Student("罗玉凤",21));
		d1.add(new Student("马征",23));
		
		b1.put("基础班", d);
		b1.put("就业班", d1);
		
		a.put("上海校区", b1);
		
		//广州校区
		HashMap<String,ArrayList<Student>> b2=new HashMap<>();
		
		ArrayList<Student> e=new ArrayList<>();
		e.add(new Student("王力宏",30));
		e.add(new Student("李静磊",32));
		
		ArrayList<Student> e1=new ArrayList<>();
		e1.add(new Student("郎朗",31));
		e1.add(new Student("柳岩",33));
		
		b2.put("基础班", e);
		b2.put("就业班", e1);
		
		a.put("广州校区", b2);
		
		//西安校区
		HashMap<String,ArrayList<Student>> b3=new HashMap<>();
		
		ArrayList<Student> f=new ArrayList<>();
		f.add(new Student("范冰冰",27));
		f.add(new Student("刘意",30));
		
		ArrayList<Student> f1=new ArrayList<>();
		f1.add(new Student("李冰冰",28));
		f1.add(new Student("张志豪 ",29));
		
		b3.put("基础班", f);
		b3.put("就业班", f1);
		
		a.put("西安校区", b3);
		
		Set<String> set = a.keySet();
		for(String g:set){
			System.out.println(g);
			HashMap<String,ArrayList<Student>> h=a.get(g);
			Set<String> set2 = h.keySet();
			for(String i:set2){
				System.out.println("\t"+i);
				ArrayList<Student> j=h.get(i);
				for(Student k:j){
					System.out.println("\t\t "+k.name+"--"+k.age);
				}
			}	
		}
	}
}