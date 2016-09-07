/**
 * 
 */
package com.atr.jd2tasks.spring.collections.beans;

import java.util.Collection;
import java.util.Map;
import java.util.Properties;

/**
 * @author Ivan Atroshonok
 *
 */
public class Address {
    private Collection<String> countriesList;
    private Collection<String> streetsSet;
    private Map<Integer, Integer> housesMap;
    private Properties personProps;

    public Address() {
	super();
    }

    @Override
    public String toString() {
	return "Address:\n countries=" + countriesList + ",\n streets=" + streetsSet + ",\n hauses=" + housesMap + ",\n Person="+ personProps + "\n";
    }

    public Collection<String> getCountriesList() {
        return countriesList;
    }

    public void setCountriesList(Collection<String> countriesList) {
        this.countriesList = countriesList;
    }

    public Collection<String> getStreetsSet() {
        return streetsSet;
    }

    public void setStreetsSet(Collection<String> streetsSet) {
        this.streetsSet = streetsSet;
    }

    public Map<Integer, Integer> getHausesMap() {
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
    
}
