package com.pdm.top.domain.bc;

import java.util.HashSet;
import java.util.Set;

/**
 * 定区信息
 * @author GUXIONG
 *
 */
public class DecidedZone {

	private String id;
    private Staff staff;
    private String name;
    private Set subareas = new HashSet(0);
    
    public DecidedZone() {
	}
    
	public DecidedZone(String id) {
		this.id = id;
	}

	public DecidedZone(String id, Staff staff, String name, Set subareas) {
		this.id = id;
		this.staff = staff;
		this.name = name;
		this.subareas = subareas;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getSubareas() {
		return subareas;
	}

	public void setSubareas(Set subareas) {
		this.subareas = subareas;
	}
    
	
    
}
