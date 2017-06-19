package com.sky.locale.service;

import com.sky.locale.service.implicit.scanner.PackageAllScaner;
import com.sky.locale.service.product.ProductService;
import com.sky.locale.service.user.UserService;
import com.sky.locale.service.order.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

/**
 * Created by gantianxing on 2017/6/18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=PackageAllScaner.class)
public class AllAutoServiceTest {

    @Autowired
    private UserService us;

    @Autowired
    private ProductService ps;

    @Autowired
    private OrderService os;

    @Test
    public void usNullTest(){
        Assert.notNull(us);
        us.add();

        Assert.notNull(ps);
        ps.add();

        Assert.notNull(os);
        os.add();
    }

}
