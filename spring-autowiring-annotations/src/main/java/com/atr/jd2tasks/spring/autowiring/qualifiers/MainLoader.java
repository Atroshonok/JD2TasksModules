package com.atr.jd2tasks.spring.autowiring.qualifiers;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLoader {
    public static void main(String[] args) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
	Person person = (Person) context.getBean("qualifierPerson");
	System.out.println(person);
	context.close();
    }
}
