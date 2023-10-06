package com.cts;

public class Batch {
	
	private int techId;
	
	private String techName;
	
	
	public Batch(){
		
	}
	
	public Batch(int techId, String techName) {
		this.techId=techId;
		this.techName=techName;
	}

	public int getTechId() {
		return techId;
	}

	public void setTechId(int techId) {
		this.techId = techId;
	}

	public String getTechName() {
		return techName;
	}

	public void setTechName(String techName) {
		this.techName = techName;
	}
	

}
