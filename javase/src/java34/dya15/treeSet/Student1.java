package java34.dya15.treeSet;

import java.util.Comparator;

public class Student1 implements Comparable<Student1> {
	String name;
	int age;
	double score;
	
	public int compareTo(Student1 o) {
		
		if(o.score==this.score){
			return this.age - o.age;
		}else{
			return (int) (o.score - this.score) ;
			}
	}

	public Student1(String name, int age, double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public Student1() {
		super();
	}

	@Override
	public String toString() {
		return "Student1 [name=" + name + ", age=" + age + ", score=" + score
				+ "]";
	}

	

	
	
	
}
