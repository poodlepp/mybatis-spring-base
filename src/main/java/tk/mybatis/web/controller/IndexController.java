package tk.mybatis.web.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author liuzh
 */
@Controller
public class IndexController {
    @RequestMapping(value = {""})
    public ModelAndView hello() {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("now", new Date());
        return mv;
    }

    @RequestMapping(value = {"/index"})
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("now", new Date());
        return mv;
    }
}
