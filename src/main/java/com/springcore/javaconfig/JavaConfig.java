package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//option field
//@ComponentScan(basePackages = "com.springcore.javaconfig")  
public class JavaConfig {

	@Bean
	public Samosa getSamosa()
	{
		return new Samosa();
	}
	@Bean(name = {"student","member","temp"})
	
	public  Student getStudent()
	{
		//System.out.println();
		//creating a new student object
		Student student = new Student(getSamosa());
		return student;
	}
}
