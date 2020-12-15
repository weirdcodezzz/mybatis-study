package com.luo.mapper;

import com.luo.pojo.Teacher;

import java.util.List;

/**
 * @author luo Fuqiang
 * @date 2020/12/3 17:06
 */
public interface TeacherMapper {

    /**
     * 获取teacher列表
     * @return
     */
    List<Teacher> getTeacherList();
}
