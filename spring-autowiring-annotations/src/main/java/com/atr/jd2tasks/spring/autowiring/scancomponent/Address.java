package com.atr.jd2tasks.spring.autowiring.scancomponent;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.atr.jd2tasks.spring.autowiring.IAddress;

/**
 * @author Ivan Atroshonok
 *
 */
@Component("componentAddress")
public class Address implements IAddress {
    @Value("Belgium")
    private String country;
    @Value("Brugge")
    private String city;
    @Value("Bayron street")
    private String street;

    public Address() {
	super();
    }

    @Override
    public String toString() {
	return "Address [country=" + country + ", city=" + city + ", street=" + street + "]";
    }

    public String getCountry() {
	return country;
    }

    public void setCountry(String country) {
	this.country = country;
    }

    public String getCity() {
	return city;
    }

    public void setCity(String city) {
	this.city = city;
    }

    public String getStreet() {
	return street;
    }

    public void setStreet(String street) {
	this.street = street;
    }

}
