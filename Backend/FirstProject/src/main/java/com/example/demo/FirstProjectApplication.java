package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(FirstProjectApplication.class, args);
		
		//System.out.println("Hello and Welcome to Spring Boot");
		
		//Alien a=new Alien();	This is hard coded object creation
		
		//Alien a=context.getBean(Alien.class);
		//a.show();
		
		
		Alien a1=context.getBean(Alien.class);
		a1.show();

//		Alien a2=context.getBean(Alien.class);
//		a2.show();
	
	}

}
