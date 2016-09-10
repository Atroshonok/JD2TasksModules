package com.atr.jd2tasks.spring.autowiring.required;

import org.springframework.beans.factory.annotation.Autowired;

public class RequiredFalsePerson {
    private String name;
    private int age;
    @Autowired(required = false)
    private Address address;

    public RequiredFalsePerson() {
	super();
    }

    @Override
    public String toString() {
	return "RequiredFalsePerson [name=" + name + ", age=" + age + ", address=" + address + "]";
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

    public Address getAddress() {
	return address;
    }

    public void setAddress(Address address) {
	this.address = address;
    }

}
