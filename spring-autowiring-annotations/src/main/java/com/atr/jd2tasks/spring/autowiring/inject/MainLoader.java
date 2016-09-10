package com.atr.jd2tasks.spring.autowiring.inject;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atr.jd2tasks.spring.autowiring.IAddress;

public class MainLoader {
    public static void main(String[] args) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
	Person person = (Person) context.getBean("injectPerson");
	System.out.println(person);
	for (IAddress address : person.getAddresses()) {
	    System.out.println(address);
	}
	context.close();
    }
}
