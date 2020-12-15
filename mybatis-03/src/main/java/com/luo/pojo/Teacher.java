package com.luo.pojo;

import java.io.Serializable;

/**
 * @author luo Fuqiang
 * @date 2020/12/3 17:02
 */
public class Teacher implements Serializable {
    private Integer id;
    private String name;

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
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
}
