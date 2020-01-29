package com.example.demo;

public class Emp {
	
	private int id;
	private String name;
	private String family;
	
	public Emp(int id, String name, String family) {
		super();
		this.id = id;
		this.name = name;
		this.family = family;
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



	public String getFamily() {
		return family;
	}



	public void setFamily(String family) {
		this.family = family;
	}



	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", family=" + family + "]";
	}	

}
