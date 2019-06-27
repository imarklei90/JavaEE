package edu.sse.ustc.springcloud.service.impl;

import edu.sse.ustc.springcloud.dao.DepartmentDao;
import edu.sse.ustc.springcloud.entity.Department;
import edu.sse.ustc.springcloud.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/** Department Service的实现类
 * @author imarklei90
 * @since 2019.06.25
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDao departmentDao;


	@Override
	public boolean add(Department department) {
		return departmentDao.addDepartment(department);
	}

	@Override
	public Department get(Long id) {
		return departmentDao.findById(id);
	}

	@Override
	public List<Department> list() {
		return departmentDao.findAll();
	}
}
