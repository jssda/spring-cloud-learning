package pers.jssd.consumer.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author jssd jssdjing@gmail.com
 * @date 2020/11/24 14:30
 */
@EnableDiscoveryClient
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class EurekaClientConsumerFeignHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientConsumerFeignHystrixApplication.class, args);
    }

}
