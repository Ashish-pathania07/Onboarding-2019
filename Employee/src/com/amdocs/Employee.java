package com.amdocs;

public class Employee {

	private String name;
	private String desigination;
	private String department;
	
	private Address address;

	public Employee(String name, String desigination, String department, String doorNo, String street, String city,
			String pinCode) {
		super();
		this.name = name;
		this.desigination = desigination;
		this.department = department;
		this.address=address;
	}

	public Employee() {
		
	}

	
	
	public static void main(String[] args) {
		
	}

}
