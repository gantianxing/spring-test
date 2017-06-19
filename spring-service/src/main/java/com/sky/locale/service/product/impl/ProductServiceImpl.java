package com.sky.locale.service.product.impl;

import com.sky.locale.dao.product.ProductDao;
import com.sky.locale.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by gantianxing on 2017/6/18.
 */
@Component
public class ProductServiceImpl implements ProductService {

    @Autowired(required = false)
    private ProductDao productDao;

    @Override
    public void add() {
        if (productDao != null){
            productDao.add();
        }
        System.out.println("service层:商品添加成功");
    }
}
