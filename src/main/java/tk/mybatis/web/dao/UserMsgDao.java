package tk.mybatis.web.dao;

import org.springframework.stereotype.Repository;
import tk.mybatis.web.bean.UserMsg;

import java.util.List;

/**
 * @author lipy
 */
@Repository
public interface UserMsgDao {
	/**
	 *
	 * @return
	 */
	int insertUserMsg(UserMsg userMsg);

	/**
	 *
	 * @param userMsg
	 * @return
	 */
	List<UserMsg> getUserMsgList(UserMsg userMsg);
}
