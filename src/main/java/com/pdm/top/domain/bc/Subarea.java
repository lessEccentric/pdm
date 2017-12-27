package com.pdm.top.domain.bc;

import java.io.Serializable;

/**
 * 分区信息
 * @author GUXIONG
 *
 */
@SuppressWarnings("serial")
public class Subarea implements Serializable{
	

	private String id;	//编码assigned手动指定
    private DecidedZone decidedZone;	//关联定区
    private Region region;	//关联区域
    private String addresskey;	//关键字
    private String startnum;	//起始号
    private String endnum;	//结束号
    private String single;	//是否区分单双号
    private String position;	//具体位置信息
    
    public Subarea() {
	}

	public Subarea(String id) {
		this.id = id;
	}

	public Subarea(String id, DecidedZone decidedZone, Region region, String addresskey, String startnum, String endnum,
			String single, String position) {
		this.id = id;
		this.decidedZone = decidedZone;
		this.region = region;
		this.addresskey = addresskey;
		this.startnum = startnum;
		this.endnum = endnum;
		this.single = single;
		this.position = position;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public DecidedZone getDecidedZone() {
		return decidedZone;
	}

	public void setDecidedZone(DecidedZone decidedZone) {
		this.decidedZone = decidedZone;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public String getAddresskey() {
		return addresskey;
	}

	public void setAddresskey(String addresskey) {
		this.addresskey = addresskey;
	}

	public String getStartnum() {
		return startnum;
	}

	public void setStartnum(String startnum) {
		this.startnum = startnum;
	}

	public String getEndnum() {
		return endnum;
	}

	public void setEndnum(String endnum) {
		this.endnum = endnum;
	}

	public String getSingle() {
		return single;
	}

	public void setSingle(String single) {
		this.single = single;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	
	
    
}
