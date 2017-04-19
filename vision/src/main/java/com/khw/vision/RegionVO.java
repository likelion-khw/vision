package com.khw.vision;

import org.springframework.stereotype.Component;

@Component
public class RegionVO {
	
	int rcode;
	String rname;
	
	public int getRcode() {
		return rcode;
	}
	public void setRcode(int rcode) {
		this.rcode = rcode;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}

}