package edu.sse.ustc.springcloud.cfgbean;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/** Config Bean
 * @author imarklei90
 * @since 2019.06.25
 */
@Configuration // 相当于applicationContext.xml
public class ConfigBean {

	/**
	 * 相当于applicationContext.xml中 <bean id="restTemplate" class="xxx.xxx.RestTemplate">
	 * @return
	 */
	@Bean
	@LoadBalanced // Ribbon实现客户端负载均衡
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

	/**
	 * 自定义算法
	 * @return
	 */
	@Bean
	public IRule myRule(){
		return new RandomRule();// 随机算法
	}
}
