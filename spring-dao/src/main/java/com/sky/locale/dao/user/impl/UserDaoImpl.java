package com.sky.locale.dao.user.impl;

import com.sky.locale.dao.user.UserDao;
import org.springframework.stereotype.Component;

/**
 * Created by gantianxing on 2017/6/18.
 */
@Component
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao层:用户添加成功");
    }
}
