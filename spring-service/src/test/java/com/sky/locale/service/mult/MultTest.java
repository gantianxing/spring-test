package com.sky.locale.service.mult;

import com.sky.locale.dao.jdbc.TestJdbcSource;
import com.sky.locale.service.implicit.scanner.PackageAllScaner;
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
@ContextConfiguration(classes=MultConfig.class)
public class MultTest {
    @Autowired
    private UserService us;

    @Autowired
    private ProductService ps;

    @Autowired
    private TestJdbcSource testDbSource;

    @Test
    public void mutliTest(){
        Assert.notNull(us);
        Assert.notNull(ps);
        Assert.notNull(testDbSource);
        us.add();
        ps.add();
        testDbSource.getSource();
    }
}
