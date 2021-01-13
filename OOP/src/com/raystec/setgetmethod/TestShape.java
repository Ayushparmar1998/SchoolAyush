package com.raystec.setgetmethod;

public class TestShape {

	public static void main(String[] args) {
		Shape s = new Shape();
		s.setBorderWidth(22);
        s.setColor("red");
        String S1= s.getColor();
        int S2 = s.getBorderWidth();
        System.out.println(S1);
        System.out.println(S2);
        
	}

}
