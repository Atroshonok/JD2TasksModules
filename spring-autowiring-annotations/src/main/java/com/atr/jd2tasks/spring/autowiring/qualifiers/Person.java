package com.atr.jd2tasks.spring.autowiring.qualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.atr.jd2tasks.spring.autowiring.IAddress;

/**
 * @author Ivan Atroshonok
 *
 */
public class Person {
    private String name;
    private int age;
    @Autowired
    @Qualifier("homeAddress")
    private IAddress address;
    @Autowired
    @AddressAnnotated
    private IAddress workAddress;
    @Autowired
    @Qualifier("anotherAddress")
    private IAddress anotherAddress;
    

    public Person() {
	super();
    }

    @Override
    public String toString() {
	return "Person [name=" + name + ", age=" + age + ",\naddresses:\n" + " address=" + address + "\n workAddress=" + workAddress + "\n anotherAddress=" + anotherAddress + "]";
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

    public IAddress getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(IAddress workAddress) {
        this.workAddress = workAddress;
    }

    
}
