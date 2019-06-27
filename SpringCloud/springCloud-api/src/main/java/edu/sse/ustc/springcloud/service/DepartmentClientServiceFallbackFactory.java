package edu.sse.ustc.springcloud.service;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import edu.sse.ustc.springcloud.entity.Department;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import javax.print.attribute.standard.NumberUp;
import java.util.List;

/** Hystrix 统一处理
 * @author imarklei90
 * @since 2019.06.27
 */
@Component
public class DepartmentClientServiceFallbackFactory implements FallbackFactory<DepartmentClientService> {
	@Override
	public DepartmentClientService create(Throwable throwable) {
		return new DepartmentClientService() {
			@Override
			public Department get(long id) {
				return null;//new Department().setDeptNo(id).setDeptName("该ID ： " + id + " 没有对应的信息，@HystrixCommand").setDbSource("NO DataBases");
			}

			@Override
			public List<Department> list() {
				return null;
			}

			@Override
			public boolean add(Department department) {
				return false;
			}
		};
	}
}
