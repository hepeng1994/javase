package day09.model;

import java.io.Serializable;

public class User implements Serializable{
	private String userName;
	private String passWord;
	private String nike;
	private int age;
	public void set(String userName, String passWord, String nike, int age) {
		this.userName = userName;
		this.passWord = passWord;
		this.nike = nike;
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", passWord=" + passWord
				+ ", nike=" + nike + ", age=" + age + "]";
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getNike() {
		return nike;
	}
	public void setNike(String nike) {
		this.nike = nike;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
