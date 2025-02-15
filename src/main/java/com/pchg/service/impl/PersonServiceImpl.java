package com.pchg.service.impl;

import com.pchg.model.Person;
import com.pchg.repo.IPersonRepo;
import com.pchg.service.IPersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements IPersonService {

    private final IPersonRepo repo;
/*
    public PersonServiceImpl(IPersonRepo repo){
        this.repo=repo;
    }
*/
    @Override
    public Person save(Person person) {
        return repo.save(person);
    }

    @Override
    public Person update(Integer id, Person person) {

        return repo.save(person);
    }

    @Override
    public List<Person> findAll() {
        return repo.findAll();
    }

    @Override
    public Person findById(Integer id) {
        return repo.findById(id).orElse(new Person());
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
