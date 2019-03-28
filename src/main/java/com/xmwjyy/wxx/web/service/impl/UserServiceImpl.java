package com.xmwjyy.wxx.web.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.xmwjyy.wxx.web.common.utils.WebResult;
import com.xmwjyy.wxx.web.mapper.TbUserAuthenticationMapper;
import com.xmwjyy.wxx.web.pojo.Expert;
import com.xmwjyy.wxx.web.pojo.TbUserAuthentication;
import com.xmwjyy.wxx.web.service.UserService;
/**
 * 用户管理Service实现了类
 * @author Snake8859
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Value("${EXPERT_USERNAME}")
	private String EXPERT_USERNAME;
	
	@Value("${EXPERT_PASSWORD_MD5}")
	private String EXPERT_PASSWORD_MD5;
	
	@Autowired
	private TbUserAuthenticationMapper tbUserAuthenticationMapper;
	
	@Override
	public WebResult login(Expert expert) {
		//判断专家用户是否为空
		if(expert==null){
			return WebResult.build(404, "fail");
		}
		if(!expert.getUsername().equals(EXPERT_USERNAME)){
			//用户名不正确
			return WebResult.build(404, "fail");
		}
		//获得密码，进行MD5加密
		String password = expert.getPassword();
		String md5DigestAsHex = DigestUtils.md5DigestAsHex(password.getBytes());
		if(!md5DigestAsHex.equals(EXPERT_PASSWORD_MD5)){
			//密码不正确
			return WebResult.build(404, "fail");
		}
		return WebResult.build(200, "success");
	}

	@Override
	public WebResult updateAuthItemById(TbUserAuthentication tbUserAuthentication) {
		//判断鉴定项是否为空
		if(tbUserAuthentication==null){
			return WebResult.build(404, "fail");
		}
		//判断专家回复内容是否为空
		String expertreply = tbUserAuthentication.getExpertreply();
		if(expertreply==null||expertreply.equals("")){
			//若为空
			return WebResult.build(404, "fail_null");
		}
		//修改专家回复状态
		tbUserAuthentication.setReplystate("1");
		//更新修改时间
		tbUserAuthentication.setUpdatetime(new Date());
		//根据uaid更新鉴定项
		int i = tbUserAuthenticationMapper.updateByPrimaryKeySelective(tbUserAuthentication);
		if(i>0){
			return WebResult.build(200, "success");
		}
		return WebResult.build(404, "fail");
	}

}
