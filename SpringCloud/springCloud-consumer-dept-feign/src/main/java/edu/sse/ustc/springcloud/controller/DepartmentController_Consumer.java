package edu.sse.ustc.springcloud.controller;

import edu.sse.ustc.springcloud.entity.Department;
import edu.sse.ustc.springcloud.service.DepartmentClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/** Consumer Controller
 * @author imarklei90
 * @since 2019.06.25
 */
@RestController
public class DepartmentController_Consumer {

	@Autowired
	private DepartmentClientService departmentClientService;

	@RequestMapping(value = "/consumer/department/get/{id}")
	public Department get(@PathVariable Long id){
		return this.departmentClientService.get(id);
	}

	@RequestMapping(value = "/consumer/department/list")
	public List<Department> list(){
		return this.departmentClientService.list();
	}

	@RequestMapping(value = "/consumer/department/add")
	public Object add(Department department){
		return this.departmentClientService.add(department);
	}
}
