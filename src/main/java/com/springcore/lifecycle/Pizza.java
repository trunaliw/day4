package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//config using annotation

public class Pizza implements InitializingBean,DisposableBean{

	

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

//	public Pizza(double price) {
//		super();
//		this.price = price;
//	}

	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pizza [price=" + price + "]";
	}
	
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("eating pizza:init");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("eating pizza:destroy");
	}
	
}
