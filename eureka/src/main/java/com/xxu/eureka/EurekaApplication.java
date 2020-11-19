package com.xxu.eureka;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
//private static final Logger Log= (Logger) LoggerFactory.getLogger(EurekaApplication.class);
    public static void main(String[] args) {

        SpringApplication.run(EurekaApplication.class, args);
    }

}
