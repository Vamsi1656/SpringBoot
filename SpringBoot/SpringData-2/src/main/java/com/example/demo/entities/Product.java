package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="orders")

public class Product {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="pname")
	private String pname;
	
	@Column(name="pprice")
	private int pprice;

}
