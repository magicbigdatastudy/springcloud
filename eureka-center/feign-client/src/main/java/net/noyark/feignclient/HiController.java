package net.noyark.feignclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    private HiService service;

    @RequestMapping("/hi")
    public String sayHi(String name){
        return service.sayHi(name);
    }
}
