package com.sky.locale.service.order.impl;

import com.sky.locale.dao.order.OrderDao;
import com.sky.locale.service.order.OrderService;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by gantianxing on 2017/6/18.
 */
@Named
public class OrderServiceImpl implements OrderService {

    @Inject
    private OrderDao orderDao;

    @Override
    public void add() {
        if(orderDao !=null){
            orderDao.add();
        }
        System.out.println("service层:订单添加成功");
    }
}
