package com.luo.pojo;

import java.io.Serializable;

/**
 * @author luo Fuqiang
 * @date 2020/12/3 17:02
 */
public class Student implements Serializable {
    private Integer id;
    private String name;
    /**
     * 关联teacher
     */
    private Teacher teacher;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacher=" + teacher +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
