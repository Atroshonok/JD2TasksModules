package com.atr.jd2tasks.spring.autowiring.scancomponent;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.atr.jd2tasks.spring.autowiring.IAddress;

/**
 * @author Ivan Atroshonok
 *
 */
@Component("componentPerson")
public class Person {
    @Value("Igor")
    private String name;
    @Value("30")
    private int age;
    @Value("#{componentAddress}")
    private IAddress address;

    public Person() {
	super();
    }

    @Override
    public String toString() {
	return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	this.age = age;
    }

    public IAddress getAddress() {
	return address;
    }

    public void setAddress(IAddress address) {
	this.address = address;
    }

}
