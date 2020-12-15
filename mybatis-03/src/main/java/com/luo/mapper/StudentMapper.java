package com.luo.mapper;

import com.luo.pojo.Student;

import java.util.List;

/**
 * @author luo Fuqiang
 * @date 2020/12/3 17:05
 */
public interface StudentMapper {

    /**
     * 获取Student列表
     * @return
     */
    List<Student> getStudentList();
}
