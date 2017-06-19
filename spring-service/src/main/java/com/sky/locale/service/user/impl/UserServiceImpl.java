package com.sky.locale.service.user.impl;

import com.sky.locale.dao.user.UserDao;
import com.sky.locale.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by gantianxing on 2017/6/18.
 */
@Component("us")
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    private UserDao userDao;

    @Override
    public void add() {
        if (userDao != null){
            userDao.add();
        }
            System.out.println("service层:用户添加成功");
    }
}
