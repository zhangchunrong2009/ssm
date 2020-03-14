package com.ssm.demo.services;

import com.ssm.demo.entity.Person;

public interface PersonService {
    Person findPersonById(long id);
}