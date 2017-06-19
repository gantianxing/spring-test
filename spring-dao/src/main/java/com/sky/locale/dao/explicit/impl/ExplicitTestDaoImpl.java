package com.sky.locale.dao.explicit.impl;

import com.sky.locale.dao.explicit.ExplicitTestDao;

/**
 * Created by gantianxing on 2017/6/18.
 */
public class ExplicitTestDaoImpl implements ExplicitTestDao {
    @Override
    public void test() {
        System.out.println("dao层:java显式注入测试成功");
    }
}
