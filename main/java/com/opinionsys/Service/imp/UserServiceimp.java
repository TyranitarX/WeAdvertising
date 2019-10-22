package com.opinionsys.Service.imp;

import com.opinionsys.Entity.User;
import com.opinionsys.JPA.UserJPA;
import com.opinionsys.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimp implements UserService {
    @Autowired
    private UserJPA userJPA;

    @Override
    public Integer login(User user) {
        User userget = userJPA.findByUsername(user.getUsername());
        if (userget.getPassword().equals(user.getPassword()))
            return 1;
        else
            return 0;
    }
}
