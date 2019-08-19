package com.amdocs;

import javax.jws.*;


@WebService
public class Hello {

	@WebMethod
	public String sayHello() {
	
		
	
	return "Hello SOAP API!";
	}
	
}
