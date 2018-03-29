package tk.mybatis.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.web.bean.UserMsg;
import tk.mybatis.web.dao.UserMsgDao;
import tk.mybatis.web.service.UserMsgService;

import java.util.Date;
import java.util.List;

@Service
public class UserMsgServiceImpl implements UserMsgService{

	@Autowired
	private UserMsgDao userMsgDao;

	@Override
	public int insertUserMsg(UserMsg userMsg) {
		userMsg.setCreateTime(new Date());
		return userMsgDao.insertUserMsg(userMsg);
	}

	@Override
	public List<UserMsg> getUserMsgList(UserMsg userMsg) {
		return userMsgDao.getUserMsgList(userMsg);
	}
}
