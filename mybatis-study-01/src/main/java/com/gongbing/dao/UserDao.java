package com.gongbing.dao;


import com.gongbing.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {

    @Select("select * from user")
    List<User> findUsers();
}
