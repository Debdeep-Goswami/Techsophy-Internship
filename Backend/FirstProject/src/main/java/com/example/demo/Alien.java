package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype")
public class Alien {
	private int aid;
	private String aname;
	private String tech;
	private static int counter=0;
	
	@Autowired			// It connects by class name
	private Laptop laptop;
	
	@Autowired
	@Qualifier("HDD")	//	It connects by name
	private SamsungHDD smhdd;
	
	public Alien() {
		super();
		counter++;
		System.out.println("Object "+counter+" Created");
		
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	public void show() {
		System.out.println("Hello From Show");
		laptop.compile();	
	}
}
