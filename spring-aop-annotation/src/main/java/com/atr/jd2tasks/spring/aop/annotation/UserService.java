package com.atr.jd2tasks.spring.aop.annotation;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {

    public void changeUserProperties(User user) {
	System.out.println("User before changing: " + user);
	user.setName("Sebastyan");
	user.setLastname("Loeb");
	System.out.println("User after changing: " + user);
    }

}
