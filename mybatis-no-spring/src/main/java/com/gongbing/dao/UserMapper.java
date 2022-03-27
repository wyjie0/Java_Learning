package com.gongbing.dao;

import com.gongbing.entity.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    // 获取所有用户
    List<User> getUserList();

    // 模糊查询
    List<User> getUserLike(String value);

    // 根据id查询用户
    User getUserById(int id);

    // 保存一个用户
    int saveUser(User user);

    // 使用map
    int saveUserWithMap(Map<String, Object> map);
}
