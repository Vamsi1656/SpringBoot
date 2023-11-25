package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Orders;


@Repository
public interface ProductRepo extends CrudRepository<Orders,Integer>{
	
}
