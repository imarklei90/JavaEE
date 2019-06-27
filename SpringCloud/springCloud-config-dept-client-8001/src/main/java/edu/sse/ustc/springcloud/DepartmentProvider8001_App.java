package edu.sse.ustc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author imarklei90
 * @since 2019.06.27
 */
@SpringBootApplication
@EnableEurekaClient // 本服务启动后会自动注册到eureka服务中
@EnableDiscoveryClient // 服务发现
public class DepartmentProvider8001_App {
	public static void main(String[] args) {
		SpringApplication.run(DepartmentProvider8001_App.class, args);
	}
}
