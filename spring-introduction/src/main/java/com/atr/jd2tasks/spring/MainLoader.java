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
	System.out.println(person);
	System.out.println("Person: " + person);
	System.out.println("Bean Name (id): " + person.getBeanName());
	Address address = (Address) context.getBean("address");
	System.out.println("Address ClassLoader : " + address.getClassLoader());
	context.close();
    }
}
