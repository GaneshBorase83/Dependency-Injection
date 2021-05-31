package com.example.demo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
//		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");  
//		Vehicle obj1=(Vehicle)(context).getBean("vehicle");
		Bike obj=new Bike();
		Car car=new Car();
		car.drive();
		obj.ride();
//		obj1.drive();

	}

}
