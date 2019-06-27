package edu.sse.ustc.springcloud.controller;

import edu.sse.ustc.springcloud.entity.Department;
import edu.sse.ustc.springcloud.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/** Department Controller
 * @author imarklei90
 * @since 2019.06.25
 */

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@Autowired
	private DiscoveryClient discoveryClient; // Eureka服务发现客户端

	@RequestMapping(value = "/department/add", method = RequestMethod.POST)
	public boolean add(@RequestBody Department department){
		return departmentService.add(department);
	}

	@RequestMapping(value = "/department/get/{id}", method = RequestMethod.GET)
	public Department get(@PathVariable Long id){
		return departmentService.get(id);
	}

	@RequestMapping(value = "department/list",method = RequestMethod.GET)
	public List<Department> list(){
		return departmentService.list();
	}

	/**
	 * Eureka服务发现
	 */
	@RequestMapping(value = "/department/discovery", method = RequestMethod.GET)
	public Object discovery(){
		List<String> list = discoveryClient.getServices();
		System.out.println("Service Instances : " + list);

		List<ServiceInstance> serviceInstances = discoveryClient.getInstances("microservicecloud-dept8001");

		for (ServiceInstance serviceInstance: serviceInstances) {
			System.out.println(serviceInstance.getHost() + "," + serviceInstance.getPort() + "," + serviceInstance.getServiceId());
		}

		return this.discoveryClient;
	}
}
