package com.netty.study.demo6.impl;

import com.netty.study.demo6.DataException;
import com.netty.study.demo6.Person;
import com.netty.study.demo6.PersonService;
import org.apache.thrift.TException;

public class PersonServiceImpl implements PersonService.Iface {
    @Override
    public Person getPersonByUsername(String username) throws DataException, TException {
        Person person = new Person();
        person.setAge(1);
        person.setUsername("彭小余");
        person.setMarried(false);
        return person;
    }

    @Override
    public void savePerson(Person person) throws DataException, TException {
        System.out.println(person);
    }
}
