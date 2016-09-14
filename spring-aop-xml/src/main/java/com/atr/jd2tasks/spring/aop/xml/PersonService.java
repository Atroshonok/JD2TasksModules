package com.atr.jd2tasks.spring.aop.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("personService")
public class PersonService implements IPersonService {
    
    @Autowired
    private Person person;
    
    public Person getPerson() {
	System.out.println("method getPerson() is working");
	return person;
    }

    public Person getPersonWithArgs(String name, Integer age) {
	System.out.println("method getPersonWithArgs(args) is working");
	Person person = new Person();
	person.setName(name);
	person.setAge(age);
	return person;
    }

    public void getPersonWithException() throws Exception {
	System.out.println("method getPersonWithException() throws an Exception");
	throw new Exception();
    }

    

}
