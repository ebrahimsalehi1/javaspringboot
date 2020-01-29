package com.ebi.salehi.testing.TreeDataSample;

public class RelationalData {
	
	private int id;
	private String txt;
	private int parent;
		
	public RelationalData(int id, String txt, int parent) {
		super();
		this.id = id;
		this.txt = txt;
		this.parent = parent;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTxt() {
		return txt;
	}
	public void setTxt(String txt) {
		this.txt = txt;
	}
	public int getParent() {
		return parent;
	}
	public void setParent(int parent) {
		this.parent = parent;
	}

}
