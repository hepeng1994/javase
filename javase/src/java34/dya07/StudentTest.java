package java34.dya07;

public class StudentTest {
	public static void main(String[] args) {
		Student t1=new Student();
		t1.name="郑贵强";
		t1.age=30;
		t1.score=80;
		
		Student t2=new Student();
		t2.name="何鹏";
		t2.age=50;
		t2.score=85;
		
		Student t3=new Student();
		t3.name="张彬";
		t3.age=20;
		t3.score=90;
		
		Student[] arr=new Student[]{t1,t2,t3};
		
		System.out.println(arr[0].name);
		
				
				
	}

}