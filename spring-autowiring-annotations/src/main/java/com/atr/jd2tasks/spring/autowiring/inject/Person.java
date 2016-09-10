package com.atr.jd2tasks.spring.autowiring.inject;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

import com.atr.jd2tasks.spring.autowiring.IAddress;

/**
 * @author Ivan Atroshonok
 *
 */
public class Person {
    private String name;
    private int age;
    @Inject
    @Named("companyAddress")
    private IAddress companyAddress;
    @Inject
    @Home
    private IAddress homeAddress;
    private List<IAddress> addresses;

    @Inject
    public Person(Provider<HomeAddress> addressProvider) {
	super();
	addresses = new ArrayList<>();
	for (int i = 0; i < 5; i++) {
	    addresses.add(addressProvider.get());
	}
    }

    @Override
    public String toString() {
	return "Person [name=" + name + ", age=" + age + ",\n companyAddress=" + companyAddress + "\n homeAddress=" + homeAddress + "\n addresses=" + addresses + "]";
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

    public IAddress getCompanyAddress() {
	return companyAddress;
    }

    public void setCompanyAddress(IAddress companyAddress) {
	this.companyAddress = companyAddress;
    }

    public List<IAddress> getAddresses() {
	return addresses;
    }

    public void setAddresses(List<IAddress> addresses) {
	this.addresses = addresses;
    }

    public IAddress getHomeAddress() {
	return homeAddress;
    }

    public void setHomeAddress(IAddress homeAddress) {
	this.homeAddress = homeAddress;
    }

}
