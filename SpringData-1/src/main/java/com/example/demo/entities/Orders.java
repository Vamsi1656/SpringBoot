package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity	
@Table(name="orders")

public class Orders {
	
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="pname")
	private String pname;
	
	@Column(name="pprice")
	private Integer pprice;

}
