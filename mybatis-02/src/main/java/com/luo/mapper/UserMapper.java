package com.luo.mapper;

import com.luo.pojo.User;

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

}
