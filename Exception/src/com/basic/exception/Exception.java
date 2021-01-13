package com.basic.exception;

public class Exception {
          static String s = "ayush";
	public static void main(String[] args) {
		    try{
		       System.out.println(s.charAt(5));
		    }
		   catch(StringIndexOutOfBoundsException e){
		    System.out.println("khatam ab nhi chalega");
	}
		}
	}
