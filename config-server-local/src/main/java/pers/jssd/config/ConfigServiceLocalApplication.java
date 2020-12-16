package pers.jssd.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author jssd jssdjing@gmail.com
 * @date 2020/11/25 15:09
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
@EnableEurekaClient
public class ConfigServiceLocalApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServiceLocalApplication.class, args);
    }

}
