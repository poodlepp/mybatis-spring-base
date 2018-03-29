package tk.mybatis.web.service;

import tk.mybatis.web.bean.UserMsg;

import java.util.List;

public interface UserMsgService {
	int insertUserMsg(UserMsg userMsg);
	List<UserMsg> getUserMsgList(UserMsg userMsg);
}
