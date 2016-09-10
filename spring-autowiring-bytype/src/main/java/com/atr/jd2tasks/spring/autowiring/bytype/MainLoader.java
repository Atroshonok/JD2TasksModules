package com.atr.jd2tasks.spring.autowiring.bytype;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atr.jd2tasks.spring.autowiring.byconstructor.PersonByConstructor;



public class MainLoader {
    public static void main(String[] args) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
	Person person = (Person) context.getBean("person");
	System.out.println(person);
	PersonByConstructor personByConstructor = (PersonByConstructor) context.getBean("personByConstructor");
	System.out.println(personByConstructor);
	context.close();
    }
}
