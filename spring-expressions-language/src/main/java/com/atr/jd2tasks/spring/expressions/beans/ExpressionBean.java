package com.atr.jd2tasks.spring.expressions.beans;

import java.util.List;

public class ExpressionBean {
    private List<String> personNames;
    private List<Person> persons;

    public ExpressionBean() {
	super();
    }

    @Override
    public String toString() {
	return "ExpressionBean [personNames=" + personNames + ", persons=" + persons + "]";
    }

    public List<Person> getPersons() {
	return persons;
    }

    public void setPersons(List<Person> persons) {
	this.persons = persons;
    }

    public List<String> getPersonNames() {
	return personNames;
    }

    public void setPersonNames(List<String> personNames) {
	this.personNames = personNames;
    }

}
