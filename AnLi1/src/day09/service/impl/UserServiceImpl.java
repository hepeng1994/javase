package day09.service.impl;

import day09.dao.impl.UserDaoImpl;
import day09.model.User;
import day09.model.UserResult;
import day09.service.UserService;

public class UserServiceImpl implements UserService{

	@Override
	public UserResult login(User user) {
		//创建返回的对象
		UserResult ur = new UserResult();
		UserDaoImpl u = new UserDaoImpl();
		//通过用户名获得数据库内用户
		User us = u.getUserByName(user.getUserName());
		if (us!=null) {
			//说明用户存在
			if (us.getPassWord().equals(user.getPassWord())) {
				ur.setResult(true);
				ur.setDes("登陆成功");
			}else{
				ur.setResult(false);
				ur.setDes("密码错误");
			}
		}else{
			ur.setResult(false);
			ur.setDes("用户不存在");
		}
		return ur;
	}

	@Override
	public UserResult register(User user) {
		//通过username获得数据库内数据
		UserDaoImpl u = new UserDaoImpl();
		User us = u.getUserByName(user.getUserName());
		//创建返回对象
		UserResult uR = new UserResult();
		if (us!=null) {
			uR.setResult(false);
			uR.setDes("给用户已存在");
		}else {
			boolean save = u.save(user);
			if (save) {
				uR.setResult(true);
				uR.setDes("注册成功");
			}else{
				uR.setResult(false);
				uR.setDes("未知异常");
			}
		}
		return uR;
	}

}
