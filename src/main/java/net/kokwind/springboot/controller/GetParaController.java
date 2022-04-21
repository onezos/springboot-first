package net.kokwind.springboot.controller;

import net.kokwind.springboot.config.PersonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetParaController {
//    @Value("${name}")
//    String name;
//    @Value("${age}")
//    int age;
    @Autowired
    PersonConfig personConfig;

    @GetMapping("/getinfo")
    public String getInfo() {
        return personConfig.getName() + " : " + personConfig.getAge();
    }
}
