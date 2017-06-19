package com.sky.locale.service.implicit.scanner;

import com.sky.locale.service.ServiceScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by gantianxing on 2017/6/18.
 */
@Configuration
@ComponentScan(basePackageClasses = {ServiceScan.class})
public class ClassScaner {
}
