package net.noyark.hystrixclient;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Controller
public class HiService {

    //调用服务。ribbon注入template对象
    @Autowired
    private RestTemplate template;

    //使用注解完成熔断器的引入，一旦引入会将
    //异常或者问题转向
    //手机问题方法的处理器
    @HystrixCommand(fallbackMethod = "errors")
    public String sayHi(String name){
        //人工抛问题，在访问负载均衡时，手动宕机一个
        return template.getForObject("http://hi-service/hi?name="+name,String.class);
    }
    //转向的同时，将服务没有处理的参数交给fallback指向
    //的方法
    public String errors(String name){
        return "hi,"+name+",sorry,error happens";
    }
}
