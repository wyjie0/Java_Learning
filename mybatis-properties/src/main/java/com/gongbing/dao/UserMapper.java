package com.gongbing.dao;

import com.gongbing.entity.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    // 获取所有用户
    List<User> getUserList();

    // 根据id查询用户
    User getUserById(int id);

    // 保存一个用户
    int saveUser(User user);
}
