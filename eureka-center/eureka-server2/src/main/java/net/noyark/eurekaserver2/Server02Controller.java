package net.noyark.eurekaserver2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
public class Server02Controller {

    //每个服务提供者，提供一个访问方法，返回数据
    //包含的当前工程的一些属性，例如端口

    @Value("${server.port}")
    private String port;
    @RequestMapping("/hi")
    public String sayHi(String name){
        return "hi"+name+"1";
    }

}
