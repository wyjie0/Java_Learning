package com.gongbing.service.impl;

import com.gongbing.dao.UserDao;
import com.gongbing.entity.User;
import com.gongbing.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> findUsers() {
        return userDao.findUsers();
    }
}
