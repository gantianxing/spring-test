package com.sky.locale.service.jdbc;

import com.sky.locale.dao.jdbc.TestJdbcSource;
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
@ContextConfiguration(locations = {"classpath:spring-jdbc.xml"})
public class JdbcSourceTest {

    @Autowired
    private TestJdbcSource testDbSource;

    @Test
    public void jdbcTest(){
        Assert.notNull(testDbSource);
        testDbSource.getSource();
    }
}
