package com.ssm.demo.services.impl;

import com.ssm.demo.dao.PersonMapperDao;
import com.ssm.demo.entity.Person;
import com.ssm.demo.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapperDao personMapperDao;
    public Person findPersonById(long id) {
        return personMapperDao.findPersonById(id);
    }
}