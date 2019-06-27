package edu.sse.ustc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/** Hystrix Dashboard
 * @author imarklei90
 * @since 2019.06.27
 */
@EnableHystrixDashboard
public class DepartmentConsumer_Dashboard_App {
	public static void main(String[] args) {
		SpringApplication.run(DepartmentConsumer_Dashboard_App.class, args);
	}
}
