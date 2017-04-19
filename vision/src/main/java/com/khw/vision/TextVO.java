package com.khw.vision;

import org.springframework.stereotype.Component;

@Component
public class TextVO {
	
	String text;
	int Store_code;
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getStore_code() {
		return Store_code;
	}
	public void setStore_code(int store_code) {
		Store_code = store_code;
	}
	
	

}