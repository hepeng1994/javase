package day09.dao;

import day09.model.User;

public interface UserDao {
	//通过username获得user
	public  User getUserByName(String userName);
	//保存user数据
	public  boolean save(User user);
}
