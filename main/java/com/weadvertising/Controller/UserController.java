package com.weadvertising.Controller;


import com.weadvertising.Entity.User;
import com.weadvertising.Service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    Logger log = LoggerFactory.getLogger(UserController.class);
    @Autowired
    UserService userService;
    ModelAndView modelAndView;
    @RequestMapping("/doLogin")
    public ModelAndView login (User user, HttpSession session){
        log.info("用户登录");
        int sign=userService.login(user);
        if (sign==1){
            modelAndView=new ModelAndView("index");
            session.setAttribute("user",user);
        }
        else {
            modelAndView=new ModelAndView("login");
            modelAndView.addObject("error","用户名或密码错误");
        }
        return modelAndView;
    }
}
