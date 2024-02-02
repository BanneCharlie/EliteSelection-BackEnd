package org.example;

import org.example.log.annotation.EnableLogAspect;
import org.example.manager.properties.MinioProperties;
import org.example.manager.properties.NoAuthUrls;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableConfigurationProperties(value = {NoAuthUrls.class, MinioProperties.class})
@EnableLogAspect
@EnableAsync
@EnableScheduling
public class ManagerApplication {
    public static void main( String[] args ){
        SpringApplication.run( ManagerApplication.class, args );
    }
}
