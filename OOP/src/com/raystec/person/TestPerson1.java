package com.raystec.person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson1 {
    public static SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
	public static void main(String[] args) throws ParseException {
		Person p = new Person();
		p.set$AVG_AGE(25);
		p.setAddress("bhavanimandi78uttarpredeshmanpuri");
		p.setName("ayush");
        p.setDob(sdf.parse("23/12/2020"));
        p.get$AVG_AGE();
        p.getAddress();
        p.getName();
        p.getDob();
        System.out.println( p.get$AVG_AGE());
        System.out.println(p.getAddress());
        System.out.println(p.getName());
        System.out.println(p.getDob());
        
        
	}

}
