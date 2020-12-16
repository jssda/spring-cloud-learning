package pers.jssd.eureka.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author jssd jssdjing@gmail.com
 * @date 2020/11/24 15:46
 */
@SpringBootConfiguration
public class RestTemplateConfig {

    /**
     * 创建一个RestTemplate
     * LoadBalanced 这个注解表示RestTemplate开起来负载均衡模式
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
