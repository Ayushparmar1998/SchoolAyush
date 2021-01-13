package com.raystec.OOP;

public abstract class Circle extends Shape {
	    public int radius;
	    public Circle(){
	    	
	    	}
	    public Circle(int radius){
	    	this.radius = radius;
	    }
	    public double Area(int radius1){
	    	double d = 3.14*radius1*radius1;
	    	return d;
	   }
}