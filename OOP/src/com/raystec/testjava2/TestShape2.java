package com.raystec.testjava2;

import com.raystec.setgetmethod.Shape;

public class TestShape2 {

	public static void main(String[] args) {
		Shape s = new Shape();
		  s.setborderWidth(45);
		  s.setColor("green");
		int S1 = s.getborderWidth();
		String S2 = s.getColor();
		System.out.println(S1);
        System.out.println(S2);
	}

}
