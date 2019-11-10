package com.mytest.pojo;

import javax.persistence.*;

@Table(name = "user_info")
public class UserInfo {
    @Id
    private Integer id;

    private String usename;

    private String password;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return usename
     */
    public String getUsename() {
        return usename;
    }

    /**
     * @param usename
     */
    public void setUsename(String usename) {
        this.usename = usename;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}