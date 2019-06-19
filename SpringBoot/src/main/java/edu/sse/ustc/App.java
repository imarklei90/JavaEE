package edu.sse.ustc;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** Spring Boot 启动类
 * @author imarklei90
 * @since 2019.06.17
 */
// 可以替代了@Configuration 和 @EnableAutoConfiguration 和 @ComponentScan 的功能
@SpringBootApplication(scanBasePackages = {"edu.sse.ustc.controller", "edu.sse.ustc.interceptor"})
public class App {

	public static void main(String[] args) {
//		SpringApplication.run(App.class, args);

		// Remove Spring Boot Banner
		SpringApplication application = new SpringApplication(App.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
	}
}
