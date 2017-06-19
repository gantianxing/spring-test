package com.sky.locale.service.explicit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by gantianxing on 2017/6/18.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ExplicitTestConfig.class)
public class ExplicitTestServiceTest {

    /**
     * 我们定义了三个ExplicitTestService实例：分别为explicitTestService0、explicitTestService1、explicitTestService2
     * 可以结合@Qualifier，或者@Resource 指定其中一个
     */
    @Autowired
    @Qualifier("explicitTestService0")
    private ExplicitTestService explicitTestService0;

    @Resource(name="explicitTestService1")
    private ExplicitTestService explicitTestService1;

    @Test
    public void testExplicit(){
        Assert.assertNotNull(explicitTestService0);
        explicitTestService0.test();

        Assert.assertNotNull(explicitTestService1);
        explicitTestService1.test();
    }
}
