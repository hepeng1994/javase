package day09.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import day09.dao.UserDao;
import day09.fileutiil.FileUtil;
import day09.model.User;

public class UserDaoImpl implements UserDao{

	@Override
	public User getUserByName(String userName) {
		QueryRunner qu = FileUtil.getQueryRunner();
		String str="select * from user where userName = ?";
		try {
			User query = qu.query(str, new BeanHandler<User>(User.class), userName);
			return query;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean save(User user) {
		QueryRunner qu = FileUtil.getQueryRunner();
		String str="insert into user (userName,passWord,nike,age) values (?,?,?,?)";
		try {
			qu.update(str,user.getUserName(),user.getPassWord(),user.getNike(),user.getAge());
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
}
