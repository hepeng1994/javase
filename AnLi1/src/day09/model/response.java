package day09.model;

import java.io.Serializable;

public class response implements Serializable{
	private String status;
	private UserResult  result;
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public UserResult getResult() {
		return result;
	}
	public void setResult(UserResult result) {
		this.result = result;
	}
	
	@Override
	public String toString() {
		return "response [status=" + status + ", result=" + result
				+ "]";
	}
	
}
