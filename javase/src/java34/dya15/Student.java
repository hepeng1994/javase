package java34.dya15;

import java.util.Comparator;

public class Student implements Comparable<Student> {
	String name;
	int age;
	double score;
	
	public int compareTo(Student o) {
		
		if(o.score==this.score){
			return this.age - o.age;
		}else{
			return (int) (o.score - this.score) ;
			}
	}

	public Student(String name, int age, double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score
				+ "]";
	}

	
	
	
}
