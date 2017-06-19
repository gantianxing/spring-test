package com.sky.locale.service.implicit.scanner;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by gantianxing on 2017/6/18.
 */
@Configuration
@ComponentScan(basePackages = {"com.sky.locale.service.product",
        "com.sky.locale.dao.user","com.sky.locale.dao.product"})
public class PackageScaner {
}
