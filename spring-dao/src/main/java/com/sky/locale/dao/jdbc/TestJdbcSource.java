package com.sky.locale.dao.jdbc;

/**
 * Created by gantianxing on 2017/6/19.
 */
public class TestJdbcSource {

    private String userName;

    private String password;

    private String uri;

    public TestJdbcSource(String userName,String password,String uri){
        this.userName = userName;
        this.password = password;
        this.uri = uri;
    }

    public void getSource(){
        System.out.println("连接数据库uri:"+uri);
        System.out.println("连接数据库用户名:"+userName);
        System.out.println("连接数据库密码:"+password);
    }
}
