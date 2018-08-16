package java34.dya07;

public class TeacherDemo {
	public static void main(String[] args) {
		Teacher thr=new Teacher();
		thr.name="郑贵强";
		thr.income=30000;
		thr.subject="历史";
		
		Teacher thr1=new Teacher();
		thr1.name="何鹏";
		thr1.income=10000;
		thr1.subject="体育";
		
		Teacher thr2=new Teacher();
		thr2.name="张彬";
		thr2.income=40000;
		thr2.subject="数学";
		
		Teacher thr3=new Teacher();
		thr3.name="刘老师";
		thr3.income=40000;
		thr3.subject="语文";
		
		Teacher [] teachers=new Teacher[]{thr,thr1,thr2,thr3};
		for(int i=0;i<teachers.length;i++){
			System.out.println("姓名："+teachers[i].name+", 收入："+teachers[i].income+", 科目："+teachers[i].subject);
		}
	}

}
