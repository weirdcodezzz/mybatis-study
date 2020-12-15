package com.luo.mapper;

import com.luo.pojo.Teacher;
import com.luo.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author luo Fuqiang
 * @date 2020/12/3 17:14
 */
public class TeacherMapperTest {


    @Test
    public void getTeacherListTest(){
        try(SqlSession sqlSession = MybatisUtil.getSqlSession()) {
            final TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
            final List<Teacher> teacherList = teacherMapper.getTeacherList();
            teacherList.forEach((v) -> System.out.println(v));
        }
    }
}
