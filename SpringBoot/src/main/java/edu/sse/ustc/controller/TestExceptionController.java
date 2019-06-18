package edu.sse.ustc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/** 测试全局异常处理器Controller
 * @author imarklei90
 * @since 2019.06.17
 */

@Controller
public class TestExceptionController {

	@RequestMapping("/testException")
	@ResponseBody
	public String show(){
		int a = 1 / 0;
		return "Test Exception";
	}
}
