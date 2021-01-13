package com.raystec.setgetmethod;

public class Triangle extends Shape {
	private int base = 0;
	public int getBase() {
		return base;
	}
    public void setBase(int base) {
		this.base = base;
	}
         int height=15;
	public double Area() {
		double d = 0.5*base*height;
		return d;
	}
      public static void main(String[] args) {
		  Triangle t = new Triangle();
		  t.setBase(25);
		  t.setborderWidth(55);
		  t.setColor("chamkila color");
		  System.out.println(t.Area());
		  System.out.println(t.getborderWidth());
		  System.out.println(t.getColor());
}
	
	}


