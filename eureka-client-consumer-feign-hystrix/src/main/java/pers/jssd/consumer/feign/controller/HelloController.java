package pers.jssd.consumer.feign.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.jssd.consumer.feign.service.HelloService;

/**
 * @author jssd jssdjing@gmail.com
 * @date 2020/11/24 16:10
 */
@RestController
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {this.helloService = helloService;}

    @GetMapping("/sayHello")
    public String sayHello() {
        return helloService.sayHello();
    }

}
