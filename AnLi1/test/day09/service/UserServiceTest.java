package day09.service;

import day09.model.User;
import day09.model.UserResult;
import day09.service.impl.UserServiceImpl;

public class UserServiceTest {
	public static void main(String[] args) {
		User user = new User();
		user.setUserName("王三");
		user.setPassWord("123");
		user.setNike("小三");
		user.setAge(15);
		UserServiceImpl u= new UserServiceImpl();
		//UserResult register = u.register(user);
		 UserResult register = u.register(user);
		System.out.println(register);
		
	}
}
