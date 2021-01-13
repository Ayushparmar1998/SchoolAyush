package com.raystec.setgetmethod;

public class TestMethod {

	public static void main(String[] args) {
		 SetterGetter s = new SetterGetter();
		   s.setBorderWidth(56);
		   s.setColor("red");
		 
		  s.getcolor();
		  s.getborderWidth();
		   System.out.println( s.getcolor());
		   System.out.println(s.getborderWidth());
	}

}

