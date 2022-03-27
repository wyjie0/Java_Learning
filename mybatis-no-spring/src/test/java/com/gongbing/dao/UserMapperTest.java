package com.gongbing.dao;

import com.gongbing.entity.User;
import com.gongbing.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {

    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        System.out.println(userList);
    }

    @Test
    public void testGetUserLike() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> w = mapper.getUserLike("w");
        System.out.println(w);
    }

    @Test
    public void test_get_user_by_id() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(3);
        System.out.println(user);
    }

    // 增删改需要提交事务
    @Test
    public void testSaveUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User wyj1 = new User(3, "wyj1", "23456");
        int count = mapper.saveUser(wyj1);
        if (count > 0) {
            sqlSession.commit();
        }
    }

    @Test
    public void testSaveUserWithMap() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<String, Object>() {
            {
                put("userId", 5);
                put("userName", "map1");
                put("userPwd", "99999");
            }
        };
        int i = mapper.saveUserWithMap(map);
        if (i > 0) {
            sqlSession.commit();
        }
    }
}
