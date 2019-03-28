package com.xmwjyy.wxx.web.mapper;

import java.util.List;

import com.xmwjyy.wxx.web.pojo.CustomAuthOrAuditItem;
import com.xmwjyy.wxx.web.pojo.QueryVo;
import com.xmwjyy.wxx.web.pojo.CustomAuthOrAuditInfo;

public interface CustomeMapper {

	/**
	 * 根据QueryVo查询鉴定内容
	 * @param vo
	 * @return
	 */
	public List<CustomAuthOrAuditInfo> selectAuthOrAuditInfoByQueryVo (QueryVo vo);
	
	/**
	 * 查询鉴定项的总条数
	 * @return
	 */
	public int selectAuthInfoCount();

}
