package edu.sse.ustc.edu.sse.ustc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** Hello RestController
 * @author imarklei90
 * @since 2019.06.17
 */

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello(){
		return "Hello Spring";
	}
}
