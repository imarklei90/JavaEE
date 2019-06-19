package edu.sse.ustc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author imarklei90
 * @since 2019.06.19
 */
@Controller
public class JDDemoController {

	@RequestMapping("/jd")
	public String showJD(){
		return "index";
	}
}
