package edu.sse.ustc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/** Department Consumer 主启动类
 * @author imarklei90
 * @since 2019.06.25
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"edu.sse.ustc.springcloud"})
@ComponentScan("edu.sse.ustc.springcloud")
public class DepartmentConsumer80_Feign_App {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentConsumer80_Feign_App.class, args);
	}
}
