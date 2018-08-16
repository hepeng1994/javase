package java34.dya21;

public class Kongkong implements Animal{
	Monkey m;

	@Override
	public void doYou() {
		System.out.print("郑贵强");
		m.doYou();
		
	}

	public Monkey getM() {
		return m;
	}

	public void setM(Monkey m) {
		this.m = m;
	}

	public Kongkong(Monkey m) {
		super();
		this.m = m;
	}

	public Kongkong() {
		super();
	}
	

}
