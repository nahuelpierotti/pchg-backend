package com.pchg.service;

import com.pchg.model.Person;

import java.util.List;

public interface IPersonService {
    Person save(Person person);
    Person update(Integer id,Person person);
    List<Person> findAll();
    Person findById(Integer id);
    void delete(Integer id);

}
