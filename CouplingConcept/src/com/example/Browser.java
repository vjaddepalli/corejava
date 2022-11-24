package com.example;

public class Browser {
	
	public void navigate(String address) {
		String ip=findIpAddress(address);
		String webPage = sendHttpRequest(ip);
		System.out.println(webPage);
	}

	//These methods must be private because used in this class only.
	//If any changes happend this class only effected.
	
	private String sendHttpRequest(String ip) {
		return "Http request Received";
		
	}

	private String findIpAddress(String address) {
		return "123.90.1.0";
	}

}
