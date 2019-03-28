package com.xmwjyy.wxx.web.service;

import com.xmwjyy.wxx.web.common.utils.WebResult;
import com.xmwjyy.wxx.web.pojo.Expert;
import com.xmwjyy.wxx.web.pojo.TbUserAuthentication;

/**
 * 用户管理Service
 * @author Snake8859
 *
 */
public interface UserService {

	/**
	 * 用户登录
	 * @param expert
	 * @return
	 */
	public WebResult login(Expert expert);
	
	/**
	 * 根据uaid更新鉴定信息 -- 专家回复和专家回复状态
	 * @param tbUserAuthentication
	 * @return
	 */
	public WebResult updateAuthItemById(TbUserAuthentication tbUserAuthentication);
	
}
