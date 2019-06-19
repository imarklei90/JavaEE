package edu.sse.ustc.controller;

import edu.sse.ustc.domain.User;
import edu.sse.ustc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author imarklei90
 * @since 2019.06.19
 */

@RestController
public class UserController {

	// 注入Service接口代理对象
	@Autowired
	private UserService userService;

	@RequestMapping("/findAll")
	public List<User> findAll() {
		List<User> userLists = userService.findAll();
		return userLists;
	}

	@RequestMapping("findByRedisCluster")
	public String findByRedisCluster(){
		String username = userService.findRedisCluster();
		return username;
	}
}
