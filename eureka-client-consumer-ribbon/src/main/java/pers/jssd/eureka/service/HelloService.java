package pers.jssd.eureka.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author jssd jssdjing@gmail.com
 * @date 2020/11/24 15:55
 */
@Service
public class HelloService {

    private final RestTemplate restTemplate;

    public HelloService(RestTemplate restTemplate) {this.restTemplate = restTemplate;}

    public String sayHello(String name) {
        return restTemplate.getForObject("http://eureka-client-provider/dc", String.class) + name;
    }
}
