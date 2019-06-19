package edu.sse.ustc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/** Hello RestController
 * @author imarklei90
 * @since 2019.06.17
 */

@RestController
@EnableAutoConfiguration(exclude = RedisAutoConfiguration.class) // 取消redis的自动配置
public class HelloController {

	/**
	 * 简单返回值
	 * @return
	 */
	@RequestMapping("/hello")
	public String hello(){
		return "Hello Spring";
	}

	/**
	 * URL带参数返回
	 * @param value
	 * @return
	 */
	@RequestMapping("/sayHello/{value}")
	@ResponseBody
	public String sayHello(@PathVariable String value){
		return "Hello " + value;
	}

	@Autowired
	private MyBean myBean;

	/**
	 * 获取Application.properties中的属性值
	 * @return
	 */
	@RequestMapping("/testMyBean")
	@ResponseBody
	public String testMyBean(){
		String name = myBean.getName();
		String description = myBean.getDescription();
		return "Application is : " + name + ", Description: " + description;
	}
}
