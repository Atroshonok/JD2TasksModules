/**
 * 
 */
package com.atr.hibtasks.beans;

/**
 * @author Atroshonok Ivan
 *
 */
public class Address extends Entity {

    private static final long serialVersionUID = 5994269275853206556L;

    private String country;
    private String city;
    private String street;
    private int houseNumber;
    
    public Address() {
	super();
    }

    
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Address [country=" + country + ", city=" + city + ", street=" + street + ", houseNumber=" + getHouseNumber()
		+ "]";
    }



    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((city == null) ? 0 : city.hashCode());
	result = prime * result + ((country == null) ? 0 : country.hashCode());
	result = prime * result + getHouseNumber();
	result = prime * result + ((street == null) ? 0 : street.hashCode());
	return result;
    }



    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (!super.equals(obj))
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Address other = (Address) obj;
	if (city == null) {
	    if (other.city != null)
		return false;
	} else if (!city.equals(other.city))
	    return false;
	if (country == null) {
	    if (other.country != null)
		return false;
	} else if (!country.equals(other.country))
	    return false;
	if (getHouseNumber() != other.getHouseNumber())
	    return false;
	if (street == null) {
	    if (other.street != null)
		return false;
	} else if (!street.equals(other.street))
	    return false;
	return true;
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



    public int getHouseNumber() {
	return houseNumber;
    }



    public void setHouseNumber(int houseNumber) {
	this.houseNumber = houseNumber;
    }

    
    
    
    
}
