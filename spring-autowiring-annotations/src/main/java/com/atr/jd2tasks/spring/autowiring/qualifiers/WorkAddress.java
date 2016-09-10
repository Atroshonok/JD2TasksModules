package com.atr.jd2tasks.spring.autowiring.qualifiers;

import com.atr.jd2tasks.spring.autowiring.IAddress;

@AddressAnnotated
public class WorkAddress implements IAddress {
    private String country;
    private String city;
    private String street;

    public WorkAddress() {
	super();
    }

    @Override
    public String toString() {
	return "WorkAddress [country=" + country + ", city=" + city + ", street=" + street + "]";
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
