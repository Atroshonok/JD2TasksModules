package com.atr.jd2tasks.spring.expressions.beans;

public class PersonBean {
    private String name;
    private Integer age;
    private Address address;

    public PersonBean() {
	super();
    }

    @Override
    public String toString() {
	return "PersonBean [name=" + name + ", age=" + age + ", address=" + address + "]";
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Integer getAge() {
	return age;
    }

    public void setAge(Integer age) {
	this.age = age;
    }

    public Address getAddress() {
	return address;
    }

    public void setAddress(Address address) {
	this.address = address;
    }

}
