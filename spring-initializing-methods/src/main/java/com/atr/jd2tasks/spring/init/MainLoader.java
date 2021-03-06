package com.atr.jd2tasks.spring.init;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atr.jd2tasks.spring.init.beans.Person;


public class MainLoader {
    public static void main(String[] args) {
   	AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config-init.xml");
   	Person person = (Person) context.getBean("person");
   	System.out.println("Person: " + person);
   	context.close();
       }
}
