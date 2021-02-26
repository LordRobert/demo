package com.example.demo.controller;

import com.example.demo.models.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController implements ApplicationContextAware {

//    @Autowired
    ApiAdapter adapter;

    ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext context) {
        this.applicationContext = context;
    }

    @RequestMapping(value = "/db/config",
            produces = { "application/json" },
            method = RequestMethod.GET)
    UserBean getDbConfigData() {
        // 这里报错，NoSuchBeanDefinitionException: No qualifying bean of type 'com.example.demo.controller.ApiAdapter' available]
        this.adapter = applicationContext.getBean(ApiAdapter.class);
        UserBean user = adapter.getData();
        return user;
    }
}
