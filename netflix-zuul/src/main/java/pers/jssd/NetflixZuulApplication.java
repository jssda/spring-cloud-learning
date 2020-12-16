package pers.jssd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author jssd jssdjing@gmail.com
 * @date 2020/11/24 17:52
 */
@EnableZuulProxy
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class NetflixZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(NetflixZuulApplication.class, args);
    }

}
