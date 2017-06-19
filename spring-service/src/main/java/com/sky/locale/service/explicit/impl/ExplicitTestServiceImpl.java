package com.sky.locale.service.explicit.impl;

import com.sky.locale.dao.explicit.ExplicitTestDao;
import com.sky.locale.service.explicit.ExplicitTestService;

import java.util.List;

/**
 * Created by gantianxing on 2017/6/18.
 */

public class ExplicitTestServiceImpl implements ExplicitTestService {

    private String name;

    private List<String> books;

    private ExplicitTestDao explicitTestDao;

    public ExplicitTestServiceImpl(){

    }

    /**
     * 方便采用构造方法注入
     * @param explicitTestDao
     */
    public ExplicitTestServiceImpl(ExplicitTestDao explicitTestDao){
        this.explicitTestDao = explicitTestDao;
    }

    @Override
    public void test() {
        System.out.println("service层:java显式注入测试成功");
    }

    /**
     * 方便采用setter方法注入
     * @param explicitTestDao
     */
    public void setExplicitTestDao(ExplicitTestDao explicitTestDao) {
        this.explicitTestDao = explicitTestDao;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBooks(List<String> books) {
        this.books = books;
    }
}