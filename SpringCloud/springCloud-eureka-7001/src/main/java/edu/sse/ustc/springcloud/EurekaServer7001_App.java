package edu.sse.ustc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/** Eureka Server的启动类
 * @author imarklei90
 * @since 2019.06.25
 */
@SpringBootApplication
@EnableEurekaServer // 注解使用Eureka Server，接受其他微服务注册进来
public class EurekaServer7001_App {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServer7001_App.class, args);
	}
}
