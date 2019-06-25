package edu.sse.ustc.springcloud.dao;

import edu.sse.ustc.springcloud.entity.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/** Department Dao 接口
 * @author imarklei90
 * @since 2019.06.25
 */

@Mapper
public interface DepartmentDao {

	/**
	 * 添加部门
	 * @param department
	 * @return
	 */
	public boolean addDepartment(Department department);

	/**
	 * 根据部门id查找对于的部门
	 * @param id
	 * @return
	 */
	public Department findById(Long id);

	/**
	 * 查找所有的部门
	 * @return
	 */
	public List<Department> findAll();

}
