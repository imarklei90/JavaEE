package edu.sse.ustc.service;

import edu.sse.ustc.domain.User;

import java.util.List;

/**
 * @author imarklei90
 * @since 2019.06.19
 */
public interface UserService {

	public List<User> findAll();

	/**
	 * 查询redis集群
	 * @return
	 */
	public String findRedisCluster();
}