package edu.sse.ustc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/** Config 启动类
 * @author imarklei90
 * @since 2019.06.27
 */
@SpringBootApplication
@EnableConfigServer
public class Config_3344_StartSpringCloudApp {
	public static void main(String[] args) {
		SpringApplication.run(Config_3344_StartSpringCloudApp.class, args);
	}
}
