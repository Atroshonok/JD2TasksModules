/**
 * 
 */
package com.atr.jd2tasks.spring.expressions.beans;

import java.util.List;
import java.util.Map;

/**
 * @author Ivan Atroshonok
 *
 */
public class Person {
    private String name;
    private int age = 21;
    private double index;
    private String work = "Java developer";
    private Address address;
    private Boolean isValidEmail;
    private List<Map<Integer, Integer>> houses;

    public Person() {
	super();
    }

    @Override
    public String toString() {
	return "Person [name=" + name + ", age=" + age + ", index=" + index + ", work=" + work + ", address=" + address + ", isValidEmail=" + isValidEmail + ", houses=" + houses + "]";
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

    public String getWork() {
	return work;
    }

    public void setWork(String work) {
	this.work = work;
    }

    public Address getAddress() {
	return address;
    }

    public void setAddress(Address address) {
	this.address = address;
    }

    public Boolean getIsValidEmail() {
	return isValidEmail;
    }

    public void setIsValidEmail(Boolean isValidEmail) {
	this.isValidEmail = isValidEmail;
    }

    public List<Map<Integer, Integer>> getHouses() {
	return houses;
    }

    public void setHouses(List<Map<Integer, Integer>> houses) {
	this.houses = houses;
    }

    public double getIndex() {
	return index;
    }

    public void setIndex(double index) {
	this.index = index;
    }

}
