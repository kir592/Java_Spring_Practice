package com.spring.springcore.ic.xmlconfig;



public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	public void hi() {
		System.out.println("inside hi");
	}
	
	
	public void bye() {
		System.out.println("inside bye");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	
	
}
