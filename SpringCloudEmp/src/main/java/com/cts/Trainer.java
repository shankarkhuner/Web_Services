package com.cts;

public class  Trainer {
	
	private int id;
	
	private String name;
	
	Batch technology;
	
	public Trainer() {
		
	}
	
	public Trainer(int id,String name) {
		this.id=id;
		this.name=name;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Batch getTechnology() {
		return technology;
	}

	public void setTechnology(Batch technology) {
		this.technology = technology;
	}
	
	
	

}
