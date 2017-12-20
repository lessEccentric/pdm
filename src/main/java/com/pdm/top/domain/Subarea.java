package com.pdm.top.domain.bc;

import java.io.Serializable;

/**
 * 分区信息
 * @author GUXIONG
 *
 */
public class Subarea implements Serializable{
	

	private String id;
    private DecidedZone decidedZone;
    private Region region;
    private String addresskey;
    private String startnum;
    private String endnum;
    private String single;
    private String position;
    
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
