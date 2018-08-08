package com.weadvertising.JPA;

import com.weadvertising.Entity.User;

public interface UserJPA extends BaseJPA<User,Integer> {
    public User findByUsername(String username);
}
