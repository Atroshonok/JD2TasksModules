package com.atr.jd2tasks.spring.aop.xml;

import org.jboss.logging.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLoader {
    private static Logger log = Logger.getLogger(MainLoader.class);

    public static void main(String[] args) {
	AbstractApplicationContext context = new  ClassPathXmlApplicationContext("spring-config.xml");
	IPersonService personService = (IPersonService) context.getBean("personService");
	Person person = personService.getPerson();
	log.info("got person: " + person);
	try {
	    personService.getPersonWithException();
	} catch (Exception e) {
	    log.error("Exception occured");
	}
	personService.getPersonWithArgs("Bob", 55);
	context.close();
    }

}
