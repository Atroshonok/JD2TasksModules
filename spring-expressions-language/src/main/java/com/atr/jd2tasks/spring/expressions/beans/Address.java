/**
 * 
 */
package com.atr.jd2tasks.spring.expressions.beans;

import java.util.Map;
import java.util.Properties;

/**
 * @author Ivan Atroshonok
 *
 */
public class Address {
    private String country;
    private Boolean isPersonOlderTwenty;
    private Map<Integer, Integer> housesMap;
    private Properties personProps;

    public Address() {
	super();
    }

    @Override
    public String toString() {
	return "Address:\n country=" + country + "\n isPersonOlderTwenty=" + isPersonOlderTwenty + ",\n houses=" + housesMap + ",\n Person=" + personProps + "\n";
    }

    public Map<Integer, Integer> getHousesMap() {
	return housesMap;
    }

    public void setHousesMap(Map<Integer, Integer> housesMap) {
	this.housesMap = housesMap;
    }

    public Properties getPersonProps() {
	return personProps;
    }

    public void setPersonProps(Properties personProps) {
	this.personProps = personProps;
    }

    public String getCountry() {
	return country;
    }

    public void setCountry(String country) {
	this.country = country;
    }

    public Boolean getIsPersonOlderTwenty() {
	return isPersonOlderTwenty;
    }

    public void setIsPersonOlderTwenty(Boolean isPersonOlderTwenty) {
	this.isPersonOlderTwenty = isPersonOlderTwenty;
    }

}
