package com.opinionsys.JPA;

import com.opinionsys.Entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserJPA extends BaseJPA<User,Integer>{
    public User findByUsername(String username);
}

