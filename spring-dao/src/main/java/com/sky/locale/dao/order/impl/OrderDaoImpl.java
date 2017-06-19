package com.sky.locale.dao.order.impl;

import com.sky.locale.dao.order.OrderDao;
import org.springframework.stereotype.Component;

/**
 * Created by gantianxing on 2017/6/18.
 */
@Component
public class OrderDaoImpl implements OrderDao {
    @Override
    public void add() {
        System.out.println("dao层:订单添加成功");
    }
}
