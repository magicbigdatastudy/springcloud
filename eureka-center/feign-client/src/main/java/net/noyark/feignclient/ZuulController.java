package net.noyark.feignclient;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ZuulController {

    @RequestMapping("zuul")
    @ResponseBody
    public String getName(String name){
        return "hi,"+name+",i am from feign";
    }
}
