package com.springcore.ci;

public class Adition {

	private int a;
	private int b;
	
	public Adition(double a, double b) {
		super();
		System.out.println("double,double");
		this.a = (int)a;
		this.b = (int)b;
	}
	public Adition(int a, int b) {
		super();
		System.out.println("int, int");
		this.a = a;
		this.b = b;
	}
	
	public Adition(String a, String b) {
		super();
		
		System.out.println("string,string");
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
	}
	
	public void dosum()
	{
		System.out.println("add : " + (this.a+this.b));
	}
}
