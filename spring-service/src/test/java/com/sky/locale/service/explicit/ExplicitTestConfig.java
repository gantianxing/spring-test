package com.sky.locale.service.explicit;

import com.sky.locale.dao.explicit.ExplicitTestDao;
import com.sky.locale.dao.explicit.impl.ExplicitTestDaoImpl;
import com.sky.locale.service.explicit.ExplicitTestService;
import com.sky.locale.service.explicit.impl.ExplicitTestServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by gantianxing on 2017/6/18.
 */
@Configuration
public class ExplicitTestConfig {

    /**
     * 把没有依赖其他对象的bean 添加到容器
     * @return
     */
    @Bean(name="explicitTestDao")
    public ExplicitTestDao explicitTestDao(){
        return new ExplicitTestDaoImpl();
    }

    /**
     * 把有依赖其他对象的bean 添加到容器
     * 采用构造方法注入 方式1：调用explicitTestDao()，不会创建多个对象explicitTestDao，是单例
     * @return
     */
    @Bean(name = "explicitTestService0")
    public ExplicitTestService explicitTestService0(){
        return new ExplicitTestServiceImpl(explicitTestDao());
    }

    /**
     * 把有依赖其他对象的bean 添加到容器
     * 采用构造方法注入 方式2:更好理解些，并且推荐使用，可以自动发现容器中的 explicitTestDao bean
     * @param explicitTestDao
     * @return
     */
    @Bean(name = "explicitTestService1")
    public ExplicitTestService explicitTestService1(ExplicitTestDao explicitTestDao){
        return new ExplicitTestServiceImpl(explicitTestDao);
    }

    /**
     * 把有依赖其他对象的bean 添加到容器
     * 采用setter方法注入，方式3:推荐使用
     * @param
     * @return
     */
    @Bean(name = "explicitTestService2")
    public ExplicitTestService explicitTestService3(){
        ExplicitTestServiceImpl impl = new ExplicitTestServiceImpl();
        impl.setExplicitTestDao(explicitTestDao());
        return impl;
    }

    /**
     * 把有依赖其他对象的bean 添加到容器
     * 采用setter方法注入，方式3:推荐使用
     * @param explicitTestDao
     * @return
     */
    @Bean(name = "explicitTestService3")
    public ExplicitTestService explicitTestService2(ExplicitTestDao explicitTestDao){
        ExplicitTestServiceImpl impl = new ExplicitTestServiceImpl();
        impl.setExplicitTestDao(explicitTestDao);
        return impl;
    }
}
