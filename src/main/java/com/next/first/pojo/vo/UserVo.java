package com.next.first.pojo.vo;

import java.io.Serializable;

public class UserVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6473239325572935862L;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private long id;
	private String name;
	private String password;
}
