package pers.jssd.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author jssd jssdjing@gmail.com
 * @date 2020/11/24 14:30
 */
@EnableDiscoveryClient
@EnableEurekaClient
@EnableHystrix
@SpringBootApplication
public class EurekaClientConsumerRibbonHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientConsumerRibbonHystrixApplication.class, args);
    }

}
