package edu.sse.ustc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author imarklei90
 * @since 2019.06.26
 */
@SpringBootApplication
@EnableEurekaServer
@EnableEurekaClient
public class EurekaServer7003_App {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServer7003_App.class, args);
	}
}
