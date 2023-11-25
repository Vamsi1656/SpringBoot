package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Company;

public interface CompanyRepo extends CrudRepository<Company, Integer> {	

}
