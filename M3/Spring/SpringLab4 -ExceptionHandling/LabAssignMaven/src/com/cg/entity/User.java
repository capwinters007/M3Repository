package com.cg.entity;


public class User {
	
	private String uname;
	private String pass;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "User [uname=" + uname + ", pass=" + pass + "]";
	}

	
	
}
