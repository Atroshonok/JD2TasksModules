package com.atr.jd2tasks.spring.autowiring.bytype;

/**
 * @author Ivan Atroshonok
 *
 */
public class Address implements IAddress {
    private String country;
    private String city;
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
