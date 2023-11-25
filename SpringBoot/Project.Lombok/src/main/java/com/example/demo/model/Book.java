package com.example.demo.model;

public class Book {
	
	private int bid;
	
	private String bname;
	
	public Book() {
		
		System.out.println("Book Constructor");
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

}
