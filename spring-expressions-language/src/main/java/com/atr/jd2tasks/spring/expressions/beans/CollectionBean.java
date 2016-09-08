package com.atr.jd2tasks.spring.expressions.beans;

import java.util.Collection;

public class CollectionBean {
    private Collection<Person> persons;

    public CollectionBean() {
	super();
    }

    public Collection<Person> getPersons() {
	return persons;
    }

    public void setPersons(Collection<Person> persons) {
	this.persons = persons;
    }

}
