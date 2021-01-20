package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserDaoImpl implements UserDao {

    private List<String> strList;
    private Map<String, User> userMap;
    private Properties properties;

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    private String userName;
    private int age;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void save() {
        System.out.println(strList);
        System.out.println(userMap);
        System.out.println(properties);
        System.out.print("save running");
    }
}
