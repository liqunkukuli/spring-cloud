package com.springboot.resrful.pojo;

import com.springboot.resrful.common.interfac.ICachableDomain;

/**
 * Created by lujw on 2017/8/2.
 */
public class User implements ICachableDomain{
    private String id;//id
    private String name;//用户名
    private String password;//密码

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
