package com.atr.jd2tasks.spring.autowiring.bytype;

public class AddressImpl implements IAddress {
    private String country;
    private String city;
    private String street;
    
    public AddressImpl() {
	super();
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "AddressImpl [country=" + country + ", city=" + city + ", street=" + street + "]";
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }
    
    
    
    
}
