package com.amdocs;

public class MobileFactory {

	public static IMobile getMobile(String mobileName) {
		IMobile mobile=null;
		if( mobileName.equals("Iphone4"))
			mobile=new IPhone4();
		else if( mobileName.equals("Iphone4"))
			mobile=new IPhone5();
		if( mobileName.equals("OnePlus5"))
			mobile=new OnePlus5();
		else
			mobile = new NullMobile();
		return mobile;
		
	}
	
	
}
