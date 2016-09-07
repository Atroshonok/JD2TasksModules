/**
 * 
 */
package com.atr.jd2tasks.spring.collections.beans;

/**
 * @author Ivan Atroshonok
 *
 */
public class Person {
    private String name;
    private String age;
    private Address address;

    public Person() {
	super();
    }

    public Person(String name, String age) {
	super();
	this.name = name;
	this.age = age;
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

}
