package com.atr.jd2tasks.spring.autowiring.required;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLoader {
    public static void main(String[] args) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
	Person person = (Person) context.getBean("requiredPerson");
	System.out.println(person);
	RequiredFalsePerson person2 = (RequiredFalsePerson) context.getBean("requiredFalsePerson");
	System.out.println(person2);
	context.close();
    }
}
