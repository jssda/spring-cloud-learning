package pers.jssd.consumer.feign.service;

import org.springframework.stereotype.Component;

/**
 * @author jssd jssdjing@gmail.com
 * @date 2020/11/24 16:52
 */
@Component
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello() {
        return "error";
    }

}
