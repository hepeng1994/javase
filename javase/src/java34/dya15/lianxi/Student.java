package java34.dya15.lianxi;

public class Student implements Comparable<Student> {
	private String name;
	private int age;
	private double score;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getScore() {
		return score;
	}


	public void setScore(double score) {
		this.score = score;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score
				+ "]";
	}


	public Student(String name, int age, double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}


	public int compareTo(Student o) {
		if(this.score==o.score){
			return this.age-o.age;
		}else{
			return o.score-this.score>0?1:-1;
		}
		
		
	}

}
