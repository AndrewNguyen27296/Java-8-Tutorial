package com.infotech;

import java.util.List;

public class Detail {
	
	private int detailId;
	private List<String> parts;
	
	public Detail(int detailId, List<String> parts) {
		super();
		this.detailId = detailId;
		this.parts = parts;
	}
	
	public int getDetailId() {
		return detailId;
	}
	public List<String> getParts() {
		return parts;
	}
	
	
}
