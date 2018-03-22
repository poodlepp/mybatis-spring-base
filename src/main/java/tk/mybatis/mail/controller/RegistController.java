package tk.mybatis.mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import tk.mybatis.mail.bean.User;
import tk.mybatis.mail.service.UserService;

import java.util.UUID;

@Controller
public class RegistController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/register")
	public ModelAndView register(User user){
		user.setCode(UUID.randomUUID().toString().replace("-",""));
		userService.regist(user);
		ModelAndView view = new ModelAndView();
		view.setViewName("mail/register");
		return view;
	}
}
