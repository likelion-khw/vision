package com.khw.vision;

import org.springframework.stereotype.Component;

@Component
public class SearchVO {
	String text;
	ColorVO color;
	int rcode;
	int red;
	int blue;
	int green;
	
	
	public int getRed() {
		return red;
	}
	public void setRed(int red) {
		this.red = red;
	}
	public int getBlue() {
		return blue;
	}
	public void setBlue(int blue) {
		this.blue = blue;
	}
	public int getGreen() {
		return green;
	}
	public void setGreen(int green) {
		this.green = green;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public ColorVO getColor() {
		return color;
	}
	public void setColor(ColorVO color) {
		this.color = color;
		this.red = color.getRed();
		this.blue = color.getBlue();
		this.green = color.getGreen();
	}
	public int getRcode() {
		return rcode;
	}
	public void setRcode(int rcode) {
		this.rcode = rcode;
	}
	

}