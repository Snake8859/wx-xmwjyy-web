package com.xmwjyy.wxx.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xmwjyy.wxx.web.pojo.CustomAuthOrAuditInfo;
import com.xmwjyy.wxx.web.pojo.Page;
import com.xmwjyy.wxx.web.pojo.QueryVo;
import com.xmwjyy.wxx.web.service.PageService;
/**
 * 页面跳转Controller
 * @author Snake8859
 *
 */
@Controller
public class PageController {

	@Autowired
	private PageService pageService;
	
	/**
	 * 跳转登录页面
	 * @return
	 */
	@RequestMapping("/login")
	public String showLogin(){
		return "login";
	}
	
	/**
	 * 跳转管理页面
	 * @param vo
	 * @param model
	 * @return
	 */
	@RequestMapping("/expert")
	public String showExpert(QueryVo vo,Model model){
		//鉴定项查询
		Page<CustomAuthOrAuditInfo> page = pageService.selectAuthInfo(vo);
		model.addAttribute("page", page);
		return "expert";
	}
}
