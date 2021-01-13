package com.raystec.oppinheritence;

public class Triangle1 extends Shape1{
	int height = 5;
	private int base = 0;
	   public int getBase() {
		return base;
	}
public void setBase(int base) {
		this.base = base;
	}
public double Area(){
	    double d = 1/2d*base*height;
	    return d;
}
public static void main(String[] args) {
	  Triangle1 t = new Triangle1();
	      t.setBandWidth(4);
	      t.setColor("gulabi");
	      t.setBase(5);
	      System.out.println(t.getBandWidth());
	      System.out.println(t.getColor());
	      System.out.println(t.Area());
	      
}


	
}

