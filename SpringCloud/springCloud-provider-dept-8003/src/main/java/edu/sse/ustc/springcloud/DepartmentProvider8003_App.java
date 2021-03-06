package edu.sse.ustc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/** Department Provider 8001 主启动类
 * @author imarklei90
 * @since 2019.06.25
 */
@SpringBootApplication
@EnableEurekaClient // 服务启动后会自动注册进Eureka服务中
@EnableDiscoveryClient // 服务发现
public class DepartmentProvider8003_App {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentProvider8003_App.class, args);
	}
}
