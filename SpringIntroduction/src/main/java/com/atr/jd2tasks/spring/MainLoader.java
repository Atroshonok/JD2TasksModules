/**
 * 
 */
package com.atr.jd2tasks.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atr.jd2tasks.spring.beans.Address;
import com.atr.jd2tasks.spring.beans.Person;

/**
 * @author Ivan Atroshonok
 *
 */
public class MainLoader {

    public static void main(String[] args) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
	Person person = (Person) context.getBean("person");
	System.out.println("Person Name: " + person.getName());
	System.out.println("Bean Name: " + person.getBeanName());
	System.out.println(person.getAddress());
	Address address = (Address) context.getBean("address");
	System.out.println("ADDRESS ClassLoader : " + address.getClassLoader());
	context.close();
    }
}
