package edu.sse.ustc.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/** 全局异常处理器
 * @author imarklei90
 * @since 2019.06.17
 */

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(Exception.class)
	@ResponseBody
	public Map<String, Object> handlerException(Exception e){
		Map<String, Object> map = new HashMap<>();
		map.put("errorCode", 500);
		map.put("errorMessage", e.getMessage());

		return map;
	}
}
