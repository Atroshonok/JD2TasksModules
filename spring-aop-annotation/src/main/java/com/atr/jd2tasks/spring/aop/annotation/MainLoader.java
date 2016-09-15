package com.atr.jd2tasks.spring.aop.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLoader {

    public static void main(String[] args) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
	User user = (User) context.getBean("user");
	UserService userService = (UserService) context.getBean("userService");
	userService.changeUserProperties(user);
	context.close();
    }

}
