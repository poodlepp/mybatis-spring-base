package tk.mybatis.mail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mail.bean.User;
import tk.mybatis.mail.dao.UserDao;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	@Override
	public void regist(User user) {
		userDao.insertUser(user);
	}
}
