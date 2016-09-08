/**
 * 
 */
package com.atr.jd2tasks.spring.beans;

import org.springframework.beans.factory.BeanClassLoaderAware;

/**
 * @author Ivan Atroshonok
 *
 */
public class Address implements BeanClassLoaderAware{
    private String country;
    private String street;
    private Integer home;
    private ClassLoader classLoader;

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

    
    public ClassLoader getClassLoader() {
        return classLoader;
    }

    public void setClassLoader(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    @Override
    public void setBeanClassLoader(ClassLoader arg0) {
	this.classLoader = arg0;
	
    }

}
