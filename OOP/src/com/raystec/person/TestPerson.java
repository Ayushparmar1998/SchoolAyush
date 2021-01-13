package com.raystec.person;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	public static SimpleDateFormat sdf= new SimpleDateFormat("MM/dd/yyyy");
	public static void main(String[] args) throws ParseException {
		Person p = new Person();
		p.set$AVG_AGE(45);
		p.setAddress("geetabhavan54indore");
		p.setName("radheshyam");
		p.setDob(sdf.parse("07/01/2021"));
		int i = p.get$AVG_AGE();
		String s= p.getName();
		String s1 = p.getAddress();
		//String s2 = p.getDob();
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(i);
		System.out.println(p.getDob());

	}

}
