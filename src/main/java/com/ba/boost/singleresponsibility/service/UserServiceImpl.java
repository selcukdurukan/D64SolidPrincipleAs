package com.ba.boost.singleresponsibility.service;

import com.ba.boost.singleresponsibility.model.User;

public class UserServiceImpl implements IUserService {

    @Override
    public User createUser() {
        User user1 = new User("Hamathamat", "selcuk@durukan.com" ,"12345");
        return user1;
    }

    @Override
    public User getUser() {
        return createUser();

    }
}
