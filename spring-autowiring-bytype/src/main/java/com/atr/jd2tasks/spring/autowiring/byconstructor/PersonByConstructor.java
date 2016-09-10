package com.atr.jd2tasks.spring.autowiring.byconstructor;

import com.atr.jd2tasks.spring.autowiring.bytype.IAddress;

/**
 * @author Ivan Atroshonok
 *
 */
public class PersonByConstructor {
    private String name;
    private int age;
    private IAddress address;

    public PersonByConstructor() {
	super();
    }
    

    public PersonByConstructor(IAddress address) {
	super();
	this.address = address;
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
