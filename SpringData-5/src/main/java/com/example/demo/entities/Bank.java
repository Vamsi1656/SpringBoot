package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="customers")

public class Bank {
	
	
	@Column(name="name")
	private String name;
	
	@Id
	@Column(name="accno")
	private double accno;
	
	@Column(name="creditedamount")
	private double creditedamount;
	
	@Column(name="debitedamount")
	private double debitedamount;

}
