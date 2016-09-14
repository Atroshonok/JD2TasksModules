package com.atr.jd2tasks.spring.aop.xml;

public interface IPersonService {

    Person getPerson();

    void getPersonWithException() throws Exception;
    
    Person getPersonWithArgs(String name, Integer age);

}
