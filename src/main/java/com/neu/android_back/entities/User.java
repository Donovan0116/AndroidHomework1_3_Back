package com.neu.android_back.entities;

import java.io.Serializable;
import javax.annotation.Generated;

public class User implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-13T11:24:28.6043436+08:00", comments="Source field: user.ID")
    private String id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-13T11:24:28.607098+08:00", comments="Source field: user.Name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-13T11:24:28.607098+08:00", comments="Source field: user.password")
    private String password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-13T11:24:28.607098+08:00", comments="Source field: user.age")
    private Integer age;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-13T11:24:28.6080611+08:00", comments="Source field: user.gender")
    private String gender;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-13T11:24:28.6080611+08:00", comments="Source Table: user")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-13T11:24:28.6060569+08:00", comments="Source field: user.ID")
    public String getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-13T11:24:28.607098+08:00", comments="Source field: user.ID")
    public void setId(String id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-13T11:24:28.607098+08:00", comments="Source field: user.Name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-13T11:24:28.607098+08:00", comments="Source field: user.Name")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-13T11:24:28.607098+08:00", comments="Source field: user.password")
    public String getPassword() {
        return password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-13T11:24:28.607098+08:00", comments="Source field: user.password")
    public void setPassword(String password) {
        this.password = password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-13T11:24:28.6080611+08:00", comments="Source field: user.age")
    public Integer getAge() {
        return age;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-13T11:24:28.6080611+08:00", comments="Source field: user.age")
    public void setAge(Integer age) {
        this.age = age;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-13T11:24:28.6080611+08:00", comments="Source field: user.gender")
    public String getGender() {
        return gender;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-13T11:24:28.6080611+08:00", comments="Source field: user.gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-13T11:24:28.6080611+08:00", comments="Source Table: user")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", password=").append(password);
        sb.append(", age=").append(age);
        sb.append(", gender=").append(gender);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}