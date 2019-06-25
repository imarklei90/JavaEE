package edu.sse.ustc.controller;

import edu.sse.ustc.domain.User;
import edu.sse.ustc.mapper.UserRepository;
import edu.sse.ustc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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

	/*@Autowired
	private UserRepository userRepository;*/

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

	/*
	*//**
	 * 查询用户列表
	 * @param model
	 * @return
	 *//*
	@RequestMapping("list")
	public ModelAndView list(Model model){
		model.addAttribute("userList", userRepository.findAll());
		model.addAttribute("title", "用户管理");
		return new ModelAndView("user/list", "userMode", model);
	}

	*//**
	 * 根据ID查找用户
	 * @param id 用户ID
	 * @param model
	 * @return
	 *//*
	@RequestMapping("findUser/{id}")
	public ModelAndView view(@PathVariable Integer id, Model model){
		User user = userRepository.findOne(id);
		model.addAttribute("user", user);
		model.addAttribute("title", "查看用户");
		return new ModelAndView("user/view", "userModel", model);
	}

	*//**
	 * 保存或者更新用户
	 * @param user
	 * @return
	 *//*
	@RequestMapping("/saveOrUpdateUser")
	public ModelAndView saveOrUpdateUser(User user){
		userRepository.save(user);
		return new ModelAndView("redirect:/users");
	}

	*//**
	 * 根据用户ID，删除用户
	 * @param id 用户ID
	 * @return
	 *//*
	@RequestMapping("/deleteUser")
	public ModelAndView delete(@PathVariable Integer id){
		userRepository.delete(id);
		return new ModelAndView("redirect:/user");
	}

	*//**
	 * 修改用户
	 * @param id 用户ID
	 * @param model
	 * @return
	 *//*
	@RequestMapping("/modifyUser/{id}")
	public ModelAndView modifyUser(Integer id, Model model){
		User user = userRepository.findOne(id);
		model.addAttribute("user", user);
		model.addAttribute("title","修改用户");
		return new ModelAndView("user/form", "userModel", model);
	}*/

}
