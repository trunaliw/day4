package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String args[])
	{
	AbstractApplicationContext context=	new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
	
//	Samosa s1=(Samosa)context.getBean("samosa");
//	System.out.println(s1);
	
	context.registerShutdownHook();
	
	System.out.println("########################");
//	
//	Pizza p=(Pizza) context.getBean("p1");
//	System.out.println(p);
	
	Example ex1=(Example) context.getBean("ex");
	System.out.println(ex1);
	
	}
}
