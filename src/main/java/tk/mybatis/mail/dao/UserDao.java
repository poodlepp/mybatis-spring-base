package tk.mybatis.mail.dao;

import org.springframework.stereotype.Repository;
import tk.mybatis.mail.bean.User;

@Repository
public interface UserDao {
	void insertUser(User user);
}
