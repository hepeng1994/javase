package day08.test1;

public class Job {
	private String jobName;
	private String Name;
	private String sex;
	private String age;
	private String salary;
	private String backGround;
	private String jobAge;
	private String Date;
	public void set(String jobName, String name, String sex, String age,
			String salary, String backGround, String jobAge, String date) {
		this.jobName = jobName;
		Name = name;
		this.sex = sex;
		this.age = age;
		this.salary = salary;
		this.backGround = backGround;
		this.jobAge = jobAge;
		Date = date;
	}
	@Override
	public String toString() {
		return "Job [jobName=" + jobName + ", Name=" + Name + ", sex=" + sex
				+ ", age=" + age + ", salary=" + salary + ", backGround="
				+ backGround + ", jobAge=" + jobAge + ", Date=" + Date + "]";
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getBackGround() {
		return backGround;
	}
	public void setBackGround(String backGround) {
		this.backGround = backGround;
	}
	public String getJobAge() {
		return jobAge;
	}
	public void setJobAge(String jobAge) {
		this.jobAge = jobAge;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	
}
