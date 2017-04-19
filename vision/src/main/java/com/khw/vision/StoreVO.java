package com.khw.vision;

import org.springframework.stereotype.Component;

@Component
public class StoreVO {
	
	int store_code;
	int business_code;
	int rcode;
	String userid;
	String operating_time;
	String store_name;
	int view_count;
	int store_text;
	int store_color;
	
	
	public int getStore_text() {
		return store_text;
	}
	public void setStore_text(int store_text) {
		this.store_text = store_text;
	}
	public int getStore_color() {
		return store_color;
	}
	public void setStore_color(int store_color) {
		this.store_color = store_color;
	}
	public int getStore_code() {
		return store_code;
	}
	public void setStore_code(int store_code) {
		this.store_code = store_code;
	}
	public int getView_count() {
		return view_count;
	}
	public void setView_count(int view_count) {
		this.view_count = view_count;
	}
	public int getBusiness_code() {
		return business_code;
	}
	public void setBusiness_code(int business_code) {
		this.business_code = business_code;
	}
	public int getRcode() {
		return rcode;
	}
	public void setRcode(int rcode) {
		this.rcode = rcode;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getOperating_time() {
		return operating_time;
	}
	public void setOperating_time(String operating_time) {
		this.operating_time = operating_time;
	}
	public String getStore_name() {
		return store_name;
	}
	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}
	
}