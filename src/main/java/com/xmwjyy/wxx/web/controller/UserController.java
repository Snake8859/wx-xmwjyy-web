package com.xmwjyy.wxx.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xmwjyy.wxx.web.common.utils.WebResult;
import com.xmwjyy.wxx.web.pojo.Expert;
import com.xmwjyy.wxx.web.pojo.TbUserAuthentication;
import com.xmwjyy.wxx.web.service.UserService;

/**
 * 用户管理
 * @author Snake8859
 *
 */
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	/**
	 * 用户登录
	 * @param expert
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/user/login",method = RequestMethod.POST)
	@ResponseBody
	public WebResult login(@RequestBody Expert expert,HttpSession session){
		WebResult webResult = userService.login(expert);
		if(webResult.getStatus()==200){
			//将用户信息放入session
			session.setAttribute("username", expert.getUsername());
		}
		return webResult;
	}
	
	/**
	 * 专家回复
	 * @param tbUserAuthentication
	 * @return
	 */
	@RequestMapping(value="/user/updateAuth")
	@ResponseBody
	public WebResult updateAuth(TbUserAuthentication tbUserAuthentication){
		WebResult webResult = userService.updateAuthItemById(tbUserAuthentication);
		return webResult;
	}
	
	
}
