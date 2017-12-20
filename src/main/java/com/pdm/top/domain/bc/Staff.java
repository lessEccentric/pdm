package com.pdm.top.domain.bc;

import java.util.HashSet;
import java.util.Set;

/**
 * 取派员信息
 * @author GUXIONG
 *
 */
public class Staff {

	private String id;	//hbm映射默认使用assigned策略
    private Standard standard;	//关联取派标准表
    private String name;	//姓名
    private String telephone;	//电话
    private String haspda;	//是否拥有PDA
    private String deltag = "0";	//删除标记
    private String station;	//单位
    private Set decidedZones = new HashSet(0);	//负责定区
    
    public Staff() {
	}

	public Staff(String id) {
		this.id = id;
	} 

	public Staff(String id, Standard standard, String name, String telephone, String haspda, String deltag,
			String station, Set decidedZones) {
		this.id = id;
		this.standard = standard;
		this.name = name;
		this.telephone = telephone;
		this.haspda = haspda;
		this.deltag = deltag;
		this.station = station;
		this.decidedZones = decidedZones;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Standard getStandard() {
		return standard;
	}

	public void setStandard(Standard standard) {
		this.standard = standard;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getHaspda() {
		return haspda;
	}

	public void setHaspda(String haspda) {
		this.haspda = haspda;
	}

	public String getDeltag() {
		return deltag;
	}

	public void setDeltag(String deltag) {
		this.deltag = deltag;
	}

	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public Set getDecidedZones() {
		return decidedZones;
	}

	public void setDecidedZones(Set decidedZones) {
		this.decidedZones = decidedZones;
	}
    
    
}
