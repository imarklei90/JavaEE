package edu.sse.ustc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/** 主启动类
 * @author imarklei90
 * @since 2019.06.27
 */
@SpringBootApplication
@EnableEurekaServer
public class Config_Git_EurekaServer_App {
	public static void main(String[] args) {
		SpringApplication.run(Config_Git_EurekaServer_App.class, args);
	}
}
