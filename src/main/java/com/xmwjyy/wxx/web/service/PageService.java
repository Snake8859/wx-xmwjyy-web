package com.xmwjyy.wxx.web.service;

import java.util.List;

import com.xmwjyy.wxx.web.pojo.CustomAuthOrAuditInfo;
import com.xmwjyy.wxx.web.pojo.Page;
import com.xmwjyy.wxx.web.pojo.QueryVo;

/**
 * 页面资源管理Service
 * @author Snake8859
 *
 */
public interface PageService {
	
	/**
	 * 根据QueryVo分页查询鉴定项
	 * @param vo
	 * @return
	 */
	public Page<CustomAuthOrAuditInfo> selectAuthInfo(QueryVo vo);

}
