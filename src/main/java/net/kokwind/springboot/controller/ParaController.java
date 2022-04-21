package net.kokwind.springboot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/para")
public class ParaController {
    //无参数接口
    @GetMapping("/first")
    public String fisrtRequest() {
        return "无参Spring Boot接口";
    }

    //传递一个参数接口:127.0.0.1:8080/para/second?name=kokwind
    //忘记传参时设置默认值，可以使用@RequestParam(required = false,defaultValue = "ANY")
    @GetMapping("/second")
    public String secondRequest(@RequestParam(required = false,defaultValue = "ANY") String name) {
        return "问号接参数Spring Boot接口，参数为：" + name;
    }

    //通过path传递参数接口：127.0.0.1:8080/para/third/kokwind/
    @GetMapping("/third/{name}")
    public String thirdRequest(@PathVariable String name) {
        return "Path带参数Spring Boot接口，参数为：" + name ;
    }
}
