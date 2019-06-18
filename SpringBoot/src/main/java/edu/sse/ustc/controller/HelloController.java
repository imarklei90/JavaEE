package edu.sse.ustc.controller;

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

	@RequestMapping("/hello")
	public String hello(){
		return "Hello Spring";
	}

	@RequestMapping("/sayHello/{value}")
	@ResponseBody
	public String sayHello(@PathVariable String value){
		return "Hello " + value;
	}

}
