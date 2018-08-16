package day09.service;

import day09.model.User;
import day09.model.UserResult;

public interface UserService {
	//登录  返回UserResult
	public UserResult login(User user);
	//注册  保存
	public UserResult register(User user);
}
