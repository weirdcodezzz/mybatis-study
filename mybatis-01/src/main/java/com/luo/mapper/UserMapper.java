package com.luo.mapper;

import com.luo.pojo.User;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.List;

/**
 * User 持久层接口
 * @author luo Fuqiang
 * @date 2020/12/3 10:58
 */
public interface UserMapper {

    /**
     * 获取User列表
     * @return
     */
    List<User> getUserList();

    /**
     * 根据id查询User
     * @param id
     * @return
     */
    User getUserById(Integer id);

    /**
     * 增加一个User
     * @param user
     * @return
     */
    Boolean addUser(User user);

    /**
     * 根据id修改User
     * @param user
     * @return
     */
    Boolean updateUserById(User user);

    /**
     * 根据id删除User
     * @param id
     * @return
     */
    Boolean deleteUserById(Integer id);

}
