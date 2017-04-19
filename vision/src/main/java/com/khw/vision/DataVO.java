package com.khw.vision;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DataVO {
	
	List<TextVO> text;
	int rcode;
	ColorVO color;
	
	public List<TextVO> getText() {
		return text;
	}
	public void setText(List<TextVO> text) {
		this.text = text;
	}
	public int getRcode() {
		return rcode;
	}
	public void setRcode(int rcode) {
		this.rcode = rcode;
	}
	public ColorVO getColor() {
		return color;
	}
	public void setColor(ColorVO color) {
		this.color = color;
	}
	
	

}