package day09.model;

import java.io.Serializable;
import java.util.Arrays;

public class Request implements Serializable{
	private String className;
	private String mothedName;
	private Class[] type;
	private Object[] value;
	@Override
	public String toString() {
		return "Request [className=" + className + ", mothedName=" + mothedName
				+ ", type=" + Arrays.toString(type) + ", value="
				+ Arrays.toString(value) + "]";
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getMothedName() {
		return mothedName;
	}
	public void setMothedName(String mothedName) {
		this.mothedName = mothedName;
	}
	public Class[] getType() {
		return type;
	}
	public void setType(Class[] type) {
		this.type = type;
	}
	public Object[] getValue() {
		return value;
	}
	public void setValue(Object[] value) {
		this.value = value;
	}
	
}
