package tk.mybatis.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import tk.mybatis.web.bean.UserMsg;
import tk.mybatis.web.service.UserMsgService;
import tk.mybatis.web.utils.JsonResult;

import java.util.List;

@Controller
@RequestMapping(value = "/web")
public class WebController {

	@Autowired
	private UserMsgService userMsgService;

	@RequestMapping(value = "msgBoard")
	public ModelAndView msgBoard(){
		ModelAndView view = new ModelAndView("/web/msgBoard");
		UserMsg msg = new UserMsg();
		List<UserMsg> msgList = userMsgService.getUserMsgList(msg);
		view.addObject("msgList",msgList);
		return view;
	}

	@RequestMapping(value = "haveNewMsg")
	public JsonResult haveNewMsg(UserMsg userMsg){
		userMsgService.insertUserMsg(userMsg);
		JsonResult result = new JsonResult();
		result.setSuccess(true);
		return result;
	}
}
