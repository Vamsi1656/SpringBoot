package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Bank;

public interface BankRepo extends JpaRepository<Bank, Serializable> {

}
