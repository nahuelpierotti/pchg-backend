package com.pchg.repo;

import com.pchg.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonRepo extends JpaRepository<Person,Integer> {
}
