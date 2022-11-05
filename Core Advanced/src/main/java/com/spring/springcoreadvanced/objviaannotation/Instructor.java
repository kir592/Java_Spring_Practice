package com.spring.springcoreadvanced.objviaannotation;

import org.springframework.stereotype.Component;

@Component
public class Instructor {

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + "]";
	}
	private int id;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
