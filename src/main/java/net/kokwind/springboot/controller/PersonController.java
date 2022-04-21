package net.kokwind.springboot.controller;

import net.kokwind.springboot.entity.Person;
import net.kokwind.springboot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("/person")
    public String getPerson(@RequestParam Integer id) {
        Person person = personService.getPersonName(id);
        return person.toString();
    }

}
