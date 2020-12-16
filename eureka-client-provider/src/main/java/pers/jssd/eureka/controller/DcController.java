package pers.jssd.eureka.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jssd
 */
@RestController
public class DcController {

    private final DiscoveryClient discoveryClient;

    public DcController(DiscoveryClient discoveryClient) {this.discoveryClient = discoveryClient;}

    @Value("${server.port}")
    private String port;

    @GetMapping("/dc")
    public String dc() {
        String services = "Services: " + discoveryClient.getServices() + "port = " + port;
        System.out.println(services);
        System.out.println("port = " + port);
        return services;
    }

    @GetMapping("/seaHello")
    public String sayHello() {
        return "Hello";
    }

}