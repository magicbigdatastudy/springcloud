package net.noyark.ribbonclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HiController {

    @Autowired
    private RestTemplate template;

    @RequestMapping("hi")
    public String hello(String name){
        //利用template对象访问服务
        //url 服务连接地址
        //http://service-hi对应了后台服务提供者的工程
        //hi?name=传入的参数
        //相当于用服务名称，代替了工程访问的域名加端口
        return template.getForObject("http://service-hi/hi?name="+name,String.class);
    }
}
