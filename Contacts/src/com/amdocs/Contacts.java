package com.amdocs;
import java.util.HashMap;

public class Contacts {
private HashMap<String ,String> contacts;

public Contacts(){
	this.contacts=new HashMap<String, String>();
}
public void addContact (String name, String mobileNo) {
	
	contacts.put(mobileNo,name);
}
public String findContactNameByMobileNo(String mobileNo) {
	String name= contacts.get( mobileNo);
	if( name==null)
       return mobileNo;
	else 
		return name;	
}

public static void main(String[] args) {
	Contacts contacts = new Contacts();
	contacts.addContact("rishi", "28346386486");
	contacts.addContact("Arun", "32869469346");
	
	String name1=contacts.findContactNameByMobileNo("1224467");
	System.out.println(name1);
	
	String name2=contacts.findContactNameByMobileNo("32869469346");
	System.out.println(name2);
}


}
