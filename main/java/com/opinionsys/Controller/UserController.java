package com.opinionsys.Controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.opinionsys.Entity.User;
import com.opinionsys.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/")
public class UserController  {
    @Autowired
    private UserService userService;

    @RequestMapping
    @ResponseBody
    public Map<String,Object> UserLogin(@RequestBody String json){
        Map<String,Object> returnMap = new HashMap<>();
        JSONObject object = JSON.parseObject(json);
        User user=new User();
        user.setUsername(object.getString("username"));
        user.setPassword(object.getString("password"));
        int key =userService.login(user);
        returnMap.put("code", key);
        return returnMap;

    }

}
