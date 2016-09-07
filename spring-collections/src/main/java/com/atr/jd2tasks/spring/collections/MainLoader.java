package com.atr.jd2tasks.spring.collections;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atr.jd2tasks.spring.collections.beans.Address;


public class MainLoader {
    public static void main(String[] args) {
   	AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
   	Address address= (Address) context.getBean("address");
   	System.out.println("Address: " + address);
   	context.close();
       }
}
