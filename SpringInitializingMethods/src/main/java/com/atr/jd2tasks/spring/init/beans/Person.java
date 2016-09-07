/**
 * 
 */
package com.atr.jd2tasks.spring.init.beans;

/**
 * @author Ivan Atroshonok
 *
 */
public class Person {
    private static Person person = new Person();
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

    public static Person getInstance() {
	return person;
    }

    public void defaultInitMethod() {
	System.out.println("default-init method works in class: " + getClass());
    }

    public void init() {
	System.out.println("init() method works in class: " + getClass());
	System.out.println("person name in XML: " + name);
	name = "Changed";
	System.out.println("person ame after init(): " + name);
    }

    public void destroy() {
	System.out.println("destroy() method works in class: " + getClass());
	System.out.println("destroy(): I do nothing!");
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
