package edu.sse.ustc.springcloud.service;

import edu.sse.ustc.springcloud.entity.Department;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/** Feign 接口实现
 * @author imarklei90
 * @since 2019.06.26
 */
//@FeignClient(value = "springCloud-dept")
@FeignClient(value = "springCloud-dept", fallbackFactory = DepartmentClientServiceFallbackFactory.class)
public interface DepartmentClientService {

	@RequestMapping(value = "/department/get/{id}", method = RequestMethod.GET)
	public Department get(@PathVariable("id") long id);

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Department> list();

	@RequestMapping(value = "/department/add", method = RequestMethod.POST)
	public boolean add(Department department);
}
