package day09.model;

import java.io.Serializable;

public class UserResult implements Serializable{
	private boolean  Result;
	private String des;
	@Override
	public String toString() {
		return "UserResult [Result=" + Result + ", des=" + des + "]";
	}
	public boolean isResult() {
		return Result;
	}
	public void setResult(boolean result) {
		Result = result;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	
}
