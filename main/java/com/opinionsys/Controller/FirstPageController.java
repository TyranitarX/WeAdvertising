package com.opinionsys.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstPageController {
    @RequestMapping("/firstpage")
    public ModelAndView firstPage(){
        ModelAndView modelAndView=new ModelAndView("index" );
        return modelAndView;
    }

}
