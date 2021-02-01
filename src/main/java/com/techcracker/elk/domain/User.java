package com.techcracker.elk.domain;

import lombok.Data;

@Data
public class User {

	private int id;
    private String name;
    
    public User() {	
	}
    
	public User(int idVal,String nameVal) {
		id = idVal;
		name = nameVal;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
       
}