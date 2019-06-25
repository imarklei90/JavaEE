package edu.sse.ustc.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/** Department 实体类
 * @author imarklei90
 * @since 2019.06.25
 */

@AllArgsConstructor // 所有参数的构造方法
@NoArgsConstructor // 空参构造函数
@Data // Getter、Setter方法
@Accessors(chain = true) // 链式访问
public class Department implements Serializable { // 必须要实现序列化

	private Long deptNo; // 主键
	private String deptName; // 部门名称
	private String dbSource; // 来自哪个数据库（微服务架构可以一个服务对应一个数据库，同一个信息可以被存储到不同的数据库中）

	// 测试
	public static void main(String[] args) {
		Department department = new Department();
		department.setDeptNo(1L).setDeptName("研发部").setDbSource("cloudDB01");

	}

}
