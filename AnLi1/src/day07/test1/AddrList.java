package day07.test1;

public class AddrList {
	String name;
	String admName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdmName() {
		return admName;
	}
	public void setAdmName(String admName) {
		this.admName = admName;
	}
	@Override
	public String toString() {
		return "AddrList [name=" + name + ", admName=" + admName + "]";
	}
	public AddrList(String name, String admName) {
		super();
		this.name = name;
		this.admName = admName;
	}
	public AddrList() {
		super();
	}
	
}
