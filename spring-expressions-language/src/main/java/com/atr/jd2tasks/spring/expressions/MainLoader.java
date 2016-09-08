package com.atr.jd2tasks.spring.expressions;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atr.jd2tasks.spring.expressions.beans.ExpressionBean;
import com.atr.jd2tasks.spring.expressions.beans.Person;
import com.atr.jd2tasks.spring.expressions.beans.PersonBean;

public class MainLoader {
    public static void main(String[] args) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
	Person person = (Person) context.getBean("person");
	System.out.println(person);
	PersonBean personBean = (PersonBean) context.getBean("personBean");
	System.out.println("PersonBean: " + personBean);
	ExpressionBean exprBean = (ExpressionBean) context.getBean("expressionBean");
	System.out.println("ExpressionBean: " + exprBean);
	context.close();
    }
}
