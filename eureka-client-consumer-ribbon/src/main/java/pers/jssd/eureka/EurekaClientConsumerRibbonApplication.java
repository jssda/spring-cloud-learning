package pers.jssd.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author jssd jssdjing@gmail.com
 * @date 2020/11/24 14:30
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientConsumerRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientConsumerRibbonApplication.class, args);
    }

}
