package com.example.demo.service;

import com.example.demo.controller.ApiAdapter;
import com.example.demo.models.UserBean;
import org.springframework.stereotype.Component;

@Component
public class DemoService implements ApiAdapter {

	@Override
	public UserBean getData() {
		UserBean user = new UserBean();
		user.setId("aaa");
		user.setName("zhangsan");
		return user;
	}


}
