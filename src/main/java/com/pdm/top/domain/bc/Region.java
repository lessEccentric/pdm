package com.pdm.top.domain.bc;

import java.util.HashSet;
import java.util.Set;

/**
 * 区域信息
 * @author GUXIONG
 *
 */
public class Region {

	private String id;	//编号
	private String province;	//省份
	private String city;	//城市
	private String district;	//区域
	private String postcode;	//邮编
	private String shortcode;	//简码
	private String citycode;	//城市编码
	private Set subareas = new HashSet(0);	//分区

	public Region() {
	}

	public Region(String id) {
		this.id = id;
	}

	public Region(String id, String province, String city, String district, String postcode, String shortcode,
			String citycode, Set subareas) {
		super();
		this.id = id;
		this.province = province;
		this.city = city;
		this.district = district;
		this.postcode = postcode;
		this.shortcode = shortcode;
		this.citycode = citycode;
		this.subareas = subareas;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district; 
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getShortcode() {
		return shortcode;
	}

	public void setShortcode(String shortcode) {
		this.shortcode = shortcode;
	}

	public String getCitycode() {
		return citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public Set getSubareas() {
		return subareas;
	}

	public void setSubareas(Set subareas) {
		this.subareas = subareas;
	}
	
	public String getInfo() {
		return province+","+city+","+district;
	}
	
	

}
