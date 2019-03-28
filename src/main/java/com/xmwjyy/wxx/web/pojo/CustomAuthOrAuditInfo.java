package com.xmwjyy.wxx.web.pojo;

import java.util.List;

public class CustomAuthOrAuditInfo {

	private String uaid;
	
	private Integer taid;
	
	private String content;
	
	private String expertreply;
	
	private String openid;
	
	private String nickname;
	
	private String replystate;
	
	private String auditstate;
	
	private String address;
	
	private String createtime;
	
	private List<TbAuthenticationPicture> picList;

	public String getUaid() {
		return uaid;
	}

	public void setUaid(String uaid) {
		this.uaid = uaid;
	}

	public Integer getTaid() {
		return taid;
	}

	public void setTaid(Integer taid) {
		this.taid = taid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getExpertreply() {
		return expertreply;
	}

	public void setExpertreply(String expertreply) {
		this.expertreply = expertreply;
	}

	
	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}
	

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getReplystate() {
		return replystate;
	}

	public void setReplystate(String replystate) {
		this.replystate = replystate;
	}

	
	public String getAuditstate() {
		return auditstate;
	}

	public void setAuditstate(String auditstate) {
		this.auditstate = auditstate;
	}
	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public List<TbAuthenticationPicture> getPicList() {
		return picList;
	}

	public void setPicList(List<TbAuthenticationPicture> picList) {
		this.picList = picList;
	}
	
	
	
}
