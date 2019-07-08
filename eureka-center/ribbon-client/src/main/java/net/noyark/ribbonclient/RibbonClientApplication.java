package net.noyark.ribbonclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class RibbonClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonClientApplication.class, args);
    }

    //ribbon组件配合一个对象RestTemplate
    //利用restTemplate调用服务
    @Bean//其他代码可以注入使用
    @LoadBalanced//利用这个对象访问服务，底层的负载均衡
    //这个注解，轮训
    public RestTemplate getResource(){
        return new RestTemplate();
    }
}
