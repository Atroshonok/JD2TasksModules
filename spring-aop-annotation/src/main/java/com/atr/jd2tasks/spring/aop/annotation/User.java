package com.atr.jd2tasks.spring.aop.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("user")
@Scope("prototype")
public class User {
   
    @Value("Ivan")
    private String name;
    
    @Value("Atroshonok")
    private String lastname;
    
    @Value("29")
    private Integer age;

    public User() {
	super();
    }

    @Override
    public String toString() {
	return "User [name=" + name + ", lastname=" + lastname + ", age=" + age + "]";
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getLastname() {
	return lastname;
    }

    public void setLastname(String lastname) {
	this.lastname = lastname;
    }

    public Integer getAge() {
	return age;
    }

    public void setAge(Integer age) {
	this.age = age;
    }

}
