package com.raystec.setgetmethod;

public class Circle extends Shape {
	         private int radius=0;
				
	               public int getRadius() {
				    return radius;
		                 	}
			public void setRadius(int radius) {
				this.radius = radius;
			}
				public  double Area()
	                     {
			       double d = 3.14*radius*radius;
			        return d;
			                    }
	           public static void main(String[] args) {
		       Circle c = new Circle();
		         c.setborderWidth(6);
		          c.setColor("red");
		          c.setRadius(12);
		       System.out.println(c.getborderWidth());
		       System.out.println(c.getColor());
		       System.out.println(c.Area());
	}
}