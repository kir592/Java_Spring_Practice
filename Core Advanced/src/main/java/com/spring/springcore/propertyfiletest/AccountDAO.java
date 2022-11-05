package com.spring.springcore.propertyfiletest;

public class AccountDAO {

	private String url;
	private String user;
	private String pw;
	
	public AccountDAO(String url, String user, String pw){
		this.url = url;
		this.user = user;
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "AccountDAO [url=" + url + ", user=" + user + ", pw=" + pw + "]";
	}
}
