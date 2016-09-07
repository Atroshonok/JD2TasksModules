/**
 * 
 */
package com.atr.jd2tasks.spring;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author Ivan Atroshonok
 *
 */
public class Person implements BeanNameAware, InitializingBean {
    private String name;
    private String age;
    private Address address;
    private String beanName;

    public String getBeanName() {
        return this.beanName;
    }

    public Person() {
	super();
    }

    public Person(String name, String age) {
	super();
	this.name = name;
	this.age = age;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getAge() {
	return age;
    }

    public void setAge(String age) {
	this.age = age;
    }

    public Address getAddress() {
	return address;
    }

    public void setAddress(Address address) {
	this.address = address;
    }

    @Override
    public void setBeanName(String beanName) {
	this.beanName = beanName;	
    }

    @Override
    public void afterPropertiesSet() throws Exception {
//	this.name = "Deny";
	
    }

}
