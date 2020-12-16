package pers.jssd.consumer.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author jssd jssdjing@gmail.com
 * @date 2020/11/24 16:08
 */
@FeignClient(value = "eureka-client-provider")
public interface HelloService {

    @GetMapping(value = "/dc")
    String sayHello();

}
