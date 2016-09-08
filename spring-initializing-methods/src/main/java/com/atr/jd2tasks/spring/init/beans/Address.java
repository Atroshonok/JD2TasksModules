/**
 * 
 */
package com.atr.jd2tasks.spring.init.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author Ivan Atroshonok
 *
 */
public class Address implements InitializingBean, DisposableBean {
    private String country;
    private String street;
    private Integer home;

    public Address() {
	super();
    }

    public Address(String country, String street, Integer home) {
	super();
	this.country = country;
	this.street = street;
	this.home = home;
    }

    @Override
    public String toString() {
	return "Address [country=" + country + ", street=" + street + ", home=" + home + "]";
    }
    
    @Override
    public void afterPropertiesSet() throws Exception {
	System.out.println("afterPropertiesSet() method works in class: " + getClass());
	
    }

    public void defaultInitMethod() {
	System.out.println("default-init method works in class: " + getClass());
    }

    @Override
    public void destroy() throws Exception {
	System.out.println("destroy() method works in class: " + getClass());

    }

    public String getCountry() {
	return country;
    }

    public void setCountry(String country) {
	this.country = country;
    }

    public String getStreet() {
	return street;
    }

    public void setStreet(String street) {
	this.street = street;
    }

    public Integer getHome() {
	return home;
    }

    public void setHome(Integer home) {
	this.home = home;
    }


}
