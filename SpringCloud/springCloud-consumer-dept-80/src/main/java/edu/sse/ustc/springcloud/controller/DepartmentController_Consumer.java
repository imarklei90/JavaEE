package edu.sse.ustc.springcloud.controller;

import edu.sse.ustc.springcloud.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/** Consumer Controller
 * @author imarklei90
 * @since 2019.06.25
 */
@RestController
public class DepartmentController_Consumer {

	private static final String REST_URL_PREFIX = "http://localhost:8001";

	/**
	 * 提供了多种便捷访问远程HTTP服务的方法，是Spring提供的用于访问Rest服务的客户端模版工具集
	 * (url,requestMap,ResponseBean.class)
	 * url:	Rest请求地址 requestMap：请求参数 ResponseBean.class HTTP响应转换成的对象类型
	 */
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/consumer/department/add")
	public boolean add(Department department){
		return restTemplate.postForObject(REST_URL_PREFIX + "/department/add", department, Boolean.class);
	}

	@RequestMapping(value = "/consumer/department/get/{id}", method = RequestMethod.GET)
	public Department get(@PathVariable Long id){
		return restTemplate.getForObject(REST_URL_PREFIX + "/department/get/" + id, Department.class);
	}

	@RequestMapping(value = "/consumer/department/list", method = RequestMethod.GET)
	public List<Department> list(){
		return restTemplate.getForObject(REST_URL_PREFIX + "/department/list", List.class);
	}
}
