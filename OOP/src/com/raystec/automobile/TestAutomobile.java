package com.raystec.automobile;

public class TestAutomobile {

	public static void main(String[] args) {
		Automobile a = new Automobile();
//       abreak z1 = new abreak();
		a.setColor("green");
		a.setSpeed(56);
		a.setMake("2019");
		String s = a.getColor();
		String s1 = a.getMake();
		int i1 = a.getSpeed();
		System.out.println(s1);
		System.out.println(s);
		System.out.println(i1);
		System.out.println(Automobile.NO_OF_GEARS);
		
		
		
 }

}
