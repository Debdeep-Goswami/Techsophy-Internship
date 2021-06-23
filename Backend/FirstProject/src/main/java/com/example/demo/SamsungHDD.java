package com.example.demo;

import org.springframework.stereotype.Component;

@Component("HDD")
public class SamsungHDD {
	
	private int id;
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void display() {
		System.out.println("Samsung Hard Disk");
	}

}
