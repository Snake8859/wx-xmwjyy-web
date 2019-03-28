package com.xmwjyy.wxx.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xmwjyy.wxx.web.mapper.CustomeMapper;
import com.xmwjyy.wxx.web.pojo.CustomAuthOrAuditInfo;
import com.xmwjyy.wxx.web.pojo.Page;
import com.xmwjyy.wxx.web.pojo.QueryVo;
import com.xmwjyy.wxx.web.service.PageService;

/**
 * 页面服务Service实现类
 * @author Snake8859
 *
 */
@Service
public class PageServiceImpl implements PageService {

	@Autowired
	private CustomeMapper customeMapper;
	
	@Override
	public Page<CustomAuthOrAuditInfo> selectAuthInfo(QueryVo vo) {
		//判断vo是否为空
		if(vo==null){
			return null;			
		}
		Page<CustomAuthOrAuditInfo> authPage = new Page<CustomAuthOrAuditInfo>();
		//设置查询条件，从哪一条开始查
		vo.setStart((vo.getPage()-1)*vo.getSize());
		//设置page的当前页
		authPage.setPage(vo.getPage());
		//设置page的每页个数
		authPage.setSize(vo.getSize());
		//设置page的总条数
		int count = customeMapper.selectAuthInfoCount();
		authPage.setTotal(count);
		//查询鉴定信息
		List<CustomAuthOrAuditInfo> rows = customeMapper.selectAuthOrAuditInfoByQueryVo(vo);
		authPage.setRows(rows);
		return authPage;
	}

}
