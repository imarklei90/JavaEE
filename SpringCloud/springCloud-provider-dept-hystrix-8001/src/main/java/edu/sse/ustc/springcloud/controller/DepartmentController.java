package edu.sse.ustc.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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

	/**
	 * 一旦服务调用方法失败并抛出错误信息之后，会自动调用@HystrixCommand标注好的fallbackMethod调用类中的指定方法
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/department/get/{id}", method = RequestMethod.GET)
	@HystrixCommand(fallbackMethod = "processHystrix_Get")
	public Department get(@PathVariable Long id){
		Department department = this.departmentService.get(id);
		if(null == department){
			throw new RuntimeException("ID " + id + " 不存在") ;
		}
		return department;
	}

	public Department processHystrix_Get(@PathVariable Long id){
		return new Department().setDeptNo(id).setDeptName("该ID ： " + id + " 没有对应的信息，@HystrixCommand").setDbSource("NO DataBases");
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
