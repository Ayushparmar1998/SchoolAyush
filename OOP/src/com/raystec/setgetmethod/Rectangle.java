package com.raystec.setgetmethod;

public class Rectangle extends Shape {
    int width= 5;
    private int length = 0;
    
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	public double Area(){
		double d = width*length;
		return d;
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.setLength(50);
		r.setborderWidth(5);
		r.setColor("grey");
		System.out.println(r.getborderWidth());
		System.out.println(r.getColor());
		System.out.println(r.Area());
		
		

	}

}
