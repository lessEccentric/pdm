package com.pdm.top.domain.bc;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import com.pdm.top.domain.user.User;

/**
 * 收派标准
 * @author GUXIONG
 *
 */
public class Standard {

	// Fields
	private String id; // 主键 （所有 varchar类型主键，生成PO类 使用 assigned 策略 委派策略）
	private User user; // 操作人 （由谁制定标准，当前登陆用户 ）
	private String name; // 标准名称
	private Double minweight; // 最小重量
	private Double maxweight; // 最大重量
	private String deltag = "0"; // 删除标记 0 未删除 1 已经删除
	private Timestamp updatetime; // 更新时间
	private Set staffs = new HashSet(0); // 使用该取派标准 取派员

	public Standard() {
	}

	public Standard(String id) {
		this.id = id;
	}

	public Standard(String id, User user, String name, Double minweight, Double maxweight, String deltag,
			Timestamp updatetime, Set staffs) {
		this.id = id;
		this.user = user;
		this.name = name;
		this.minweight = minweight;
		this.maxweight = maxweight;
		this.deltag = deltag;
		this.updatetime = updatetime;
		this.staffs = staffs;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getMinweight() {
		return minweight;
	}

	public void setMinweight(Double minweight) {
		this.minweight = minweight;
	}

	public Double getMaxweight() {
		return maxweight;
	}

	public void setMaxweight(Double maxweight) {
		this.maxweight = maxweight;
	}

	public String getDeltag() {
		return deltag;
	}

	public void setDeltag(String deltag) {
		this.deltag = deltag;
	}

	public Timestamp getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Timestamp updatetime) {
		this.updatetime = updatetime;
	}

	public Set getStaffs() {
		return staffs;
	}

	public void setStaffs(Set staffs) {
		this.staffs = staffs;
	}
	
	
	
}
