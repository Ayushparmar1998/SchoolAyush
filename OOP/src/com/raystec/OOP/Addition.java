package com.raystec.OOP;

public class Addition {
    public void add(int a,int b){
    	System.out.println(a+b);
    }
    public void add(int a,int b,int c){
    	System.out.println(a+b+c);
    }
    public void add(int a,float b){
    	System.out.println(a+b);
    }
    public void add(float a,float b){
    	System.out.println(a+b);
    }
    public void add(float a,double b){
    	     System.out.println(a+b);
    }
       public static void main(String[] args) {
		Addition z = new Addition();
	     z.add(2, 3);
	     z.add(2, 2.2f);
	     z.add(56, 60, 40);
	    z.add(2.33f , 2.3333d); 
	}
}
