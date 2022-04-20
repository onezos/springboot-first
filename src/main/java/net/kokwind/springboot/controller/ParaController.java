package net.kokwind.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParaController {
    @GetMapping("/first")
    public String fisrtRequest() {
        return "第一个Spring Boot接口";
    }
}
