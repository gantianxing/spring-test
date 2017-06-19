package com.sky.locale.dao.product.impl;

import com.sky.locale.dao.product.ProductDao;
import org.springframework.stereotype.Component;

/**
 * Created by gantianxing on 2017/6/18.
 */
@Component
public class ProductDaoImpl implements ProductDao{
    @Override
    public void add() {
        System.out.println("dao层:商品添加成功");
    }
}
