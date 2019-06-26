package edu.sse.ustc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/** Department Consumer 主启动类
 * @author imarklei90
 * @since 2019.06.25
 */
@SpringBootApplication
@EnableEurekaClient
public class DepartmentConsumer80_App {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentConsumer80_App.class, args);
	}
}
