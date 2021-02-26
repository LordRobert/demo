package com.example.demo.controller;

import com.example.demo.models.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @Autowired
    ApiAdapter adapter;

    @RequestMapping(value = "/db/config",
            produces = { "application/json" },
            method = RequestMethod.GET)
    UserBean getDbConfigData() {
        UserBean user = adapter.getData();
        return user;
    }
}
