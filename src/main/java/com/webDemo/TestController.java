package com.webDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import tk.mybatis.web.model.SysDict;

import java.util.List;

@Controller
@RequestMapping("/listen")
public class TestController {

	@RequestMapping(value = "/appListener")
	public ModelAndView test(){
		ModelAndView mv = new ModelAndView("listen/appListen");
//		List<SysDict> dicts = dictService.findBySysDict(sysDict, offset, limit);
//		mv.addObject("dicts", dicts);
		return mv;
	}
}
