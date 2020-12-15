package com.luo.mapper;

import com.luo.pojo.Student;
import com.luo.pojo.Teacher;
import com.luo.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author luo Fuqiang
 * @date 2020/12/3 17:25
 */
public class StudentMapperTest {

    @Test
    public void getStudentListTest(){
        try(SqlSession sqlSession = MybatisUtil.getSqlSession()) {
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            List<Student> studentList = studentMapper.getStudentList();
            studentList.forEach((v) -> System.out.println(v));
        }
    }
}
