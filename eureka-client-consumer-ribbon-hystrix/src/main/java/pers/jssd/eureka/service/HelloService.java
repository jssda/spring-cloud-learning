package pers.jssd.eureka.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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

    @HystrixCommand(fallbackMethod = "hasError")
    public String sayHello(String name) {
        return restTemplate.getForObject("http://eureka-client-provider/dc", String.class) + name;
    }

    private String hasError(String name) {
        return "发生了错误" + name;
    }

}
