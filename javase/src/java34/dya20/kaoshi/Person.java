package java34.dya20.kaoshi;

public class Person {
	 private String name;
	 private int age;
	 private double sorc;
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
	public double getSorc() {
		return sorc;
	}
	public void setSorc(double sorc) {
		this.sorc = sorc;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sorc=" + sorc + "]";
	}
	public Person(String name, int age, double sorc) {
		super();
		this.name = name;
		this.age = age;
		this.sorc = sorc;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(sorc);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(sorc) != Double
				.doubleToLongBits(other.sorc))
			return false;
		return true;
	}
	
}
