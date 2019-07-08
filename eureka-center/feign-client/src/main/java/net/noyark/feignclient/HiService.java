package net.noyark.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("service-hi")
public interface HiService {

    //template.getObject(url,type)
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHi(String name);

}
