package net.kokwind.springboot.service;

import net.kokwind.springboot.entity.Person;
import net.kokwind.springboot.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    private PersonMapper personMapper;

    public Person getPersonName(Integer id) {
        return personMapper.getPersonById(id);
    }
}
