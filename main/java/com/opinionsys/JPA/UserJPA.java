package com.opinionsys.JPA;

import com.opinionsys.Entity.User;

public interface UserJPA extends BaseJPA<User,Integer> {
    public User findByUsername(String username);
}
