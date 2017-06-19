package com.sky.locale.service.mult;

import com.sky.locale.service.product.ProductServiceConfig;
import com.sky.locale.service.user.UserServiceConfig;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by gantianxing on 2017/6/19.
 */
@Import({UserServiceConfig.class,ProductServiceConfig.class})
@ImportResource("classpath:spring-jdbc.xml")
public class MultConfig {
}
