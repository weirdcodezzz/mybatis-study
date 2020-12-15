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


}
