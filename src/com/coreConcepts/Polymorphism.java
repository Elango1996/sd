package com.coreConcepts;

public class Polymorphism {
	
	/*overloading */
	public static  void Tamil(int  a) {
		System.out.println("super man");
	}
	public void tamil(Parent suber) {
		System.out.println("nice one");
	}
	public static void Tamil(float b, int a, String d) {
		System.out.println("super women");
		
	}
	
	
public static void main(String[] args) {
	System.out.println("done");
	Polymorphism tamil= new Polymorphism();

	
	Tamil(500);
	Tamil(100, 2000, "elango");
	
}
}
