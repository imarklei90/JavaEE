package edu.sse.ustc.service.impl;

import edu.sse.ustc.domain.User;
import edu.sse.ustc.mapper.UserMapper;
import edu.sse.ustc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisCluster;

import java.util.List;

/**
 * @author imarklei90
 * @since 2019.06.19
 */

@Service
public class UserServiceImpl implements UserService {

	// 注入Mapper接口代理对象
	@Autowired
	private UserMapper userMapper;

	// 注入Redis集群对象
	@Autowired
	private JedisCluster jedisCluster;

	// 加入Redis缓存
	@Cacheable(value = "findAll")
	public List<User> findAll() {
		List<User> userLists = userMapper.findAll();
		return userLists;
	}

	public String findRedisCluster(){
		jedisCluster.set("username", "redis");
		String username = jedisCluster.get("username");
		return username;
	}
}
