package com.opinionsys.Service.imp;

import com.opinionsys.Entity.User;
import com.opinionsys.JPA.UserJPA;
import com.opinionsys.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserJPA userJPA;

    @Override
    public Integer login(User user) {
        User user1 = userJPA.findByUsername(user.getUsername());
        if (user1 != null) {
            if (user1.getPassword().equals(user.getPassword()))
                return 1;
            else
                return 0;
        }
        else
            return -1;
    }
}
