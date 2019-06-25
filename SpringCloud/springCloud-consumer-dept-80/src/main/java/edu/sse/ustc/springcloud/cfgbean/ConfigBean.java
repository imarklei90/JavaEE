package edu.sse.ustc.springcloud.cfgbean;

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
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
}
