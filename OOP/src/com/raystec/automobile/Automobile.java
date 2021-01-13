package com.raystec.automobile;

public class Automobile {

		private String color = null;
		private int Speed  = 0;
		private String make = null;
		public static final  int NO_OF_GEARS = 5;
		 static abreak z1 = new abreak();
		public String abreak() {
			if (Speed>0&&Speed<100){
				System.out.println(Speed=Speed);
//				 Speed= this.Speed;
			}
			else{
				System.out.println("abreak");
				 Speed=0;
				}
			return null;
	}
	
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public int getSpeed() {
			return Speed;
		}
		public void setSpeed(int speed) {
			this.Speed = speed;
		}
		public String getMake() {
			return make;
		}
		public void setMake(String string) {
			this.make = string;
		}
		
		
 }


