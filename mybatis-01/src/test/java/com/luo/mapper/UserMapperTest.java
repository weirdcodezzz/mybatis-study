package com.luo.mapper;

import com.luo.pojo.User;
import com.luo.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author luo Fuqiang
 * @date 2020/12/3 11:18
 */
public class UserMapperTest {

    @Test
    public void getUserListTest(){
        // 第一步：获得SQLSession对象
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        // 方式一：getMapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUserList();

        // 方式二：
        //List<User> userList = sqlSession.selectList("com.luo.mapper.UserMapper.getUserList");

        userList.forEach((v) -> System.out.println(v));

        // 关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void getUserByIdTest() {
        try(SqlSession sqlSession = MybatisUtil.getSqlSession()) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = userMapper.getUserById(3);
            System.out.println(user);
        }
    }


    @Test
    public void addUserTest() {
        try(SqlSession sqlSession = MybatisUtil.getSqlSession()) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = new User();
            user.setId(7);
            user.setName("提莫");
            user.setPwd("123456");
            Boolean isOk = userMapper.addUser(user);
            sqlSession.commit();
            assert isOk == true;
        }
    }

    @Test
    public void updateUserByIdTest(){
        try(SqlSession sqlSession = MybatisUtil.getSqlSession()){
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = new User();
            user.setId(6);
            user.setName("艾希");
            user.setPwd("123456");
            Boolean isOk = userMapper.updateUserById(user);
            sqlSession.commit();
            assert isOk == true;
        }
    }

    @Test
    public void deleteUserByIdTest(){
        try(SqlSession sqlSession = MybatisUtil.getSqlSession()){
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            Boolean isOk = userMapper.deleteUserById(7);
            sqlSession.commit();
            assert isOk == true;
        }
    }
}
