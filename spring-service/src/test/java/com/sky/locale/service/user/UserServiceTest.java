package com.sky.locale.service.user;

import com.sky.locale.dao.user.UserDaoConfig;
import com.sky.locale.service.user.UserService;
import com.sky.locale.service.user.UserServiceConfig;
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
@ContextConfiguration(classes={UserServiceConfig.class,UserDaoConfig.class})
public class UserServiceTest {
    @Autowired
    private UserService us;

    @Test
    public void usNullTest(){
        Assert.notNull(us);
        us.add();
    }
}
