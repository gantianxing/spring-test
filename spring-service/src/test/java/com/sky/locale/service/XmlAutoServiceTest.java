package com.sky.locale.service;

import com.sky.locale.service.implicit.scanner.PackageAllScaner;
import com.sky.locale.service.order.OrderService;
import com.sky.locale.service.product.ProductService;
import com.sky.locale.service.user.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

/**
 * Created by gantianxing on 2017/6/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-test.xml"})
public class XmlAutoServiceTest {
    @Autowired
    private ProductService ps;

    @Test
    public void usNullTest(){
        Assert.notNull(ps);
        ps.add();
    }
}
