package edu.sse.ustc.springcloud.service;

import edu.sse.ustc.springcloud.entity.Department;

import java.util.List;

/** Department Service接口
 * @author imarklei90
 * @since 2019.06.25
 */
public interface DepartmentService {

	/**
	 * 添加部门
	 * @param department
	 * @return
	 */
	public boolean add(Department department);

	/**
	 * 根据部门id查找对于的部门
	 * @param id
	 * @return
	 */
	public Department get(Long id);

	/**
	 * 查找所有的部门
	 * @return
	 */
	public List<Department> list();
}
