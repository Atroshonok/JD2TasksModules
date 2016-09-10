package com.atr.jd2tasks.spring.autowiring.scancomponent;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.atr.jd2tasks.spring.autowiring.IAddress;

@Component("companyAddress")
public class CompanyAddress implements IAddress {
    @Value("Belarus")
    private String contry;
    @Value("Grodno")
    private String city;
    @Value("Sovetskaya")
    private String street;

    public CompanyAddress() {
	super();
    }

    @Override
    public String toString() {
	return "CompanyAddress [contry=" + contry + ", city=" + city + ", street=" + street + "]";
    }

    public String getContry() {
	return contry;
    }

    public void setContry(String contry) {
	this.contry = contry;
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
