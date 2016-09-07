/**
 * 
 */
package com.atr.jd2tasks.constructor.beans;

/**
 * @author Ivan Atroshonok
 *
 */
public class Person {
    private String name;
    private Integer age;
    private String work = "there is";

    public Person() {
	super();
    }

    public Person(String name, Integer age) {
	super();
	this.name = name;
	this.age = age;
    }

    @Override
    public String toString() {
	return "Person [name=" + name + ", age=" + age + ", work=" + work + "]";
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

}
