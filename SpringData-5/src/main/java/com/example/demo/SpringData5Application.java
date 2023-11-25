package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Bank;
import com.example.demo.repository.BankRepo;

@SpringBootApplication
public class SpringData5Application implements CommandLineRunner {
	
	@Autowired
	BankRepo bankRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringData5Application.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
	      
		Bank b1=new Bank();
		b1.setName("Nani");
		b1.setAccno(673565567);
		b1.setCreditedamount(1000000);
		b1.setDebitedamount(50000);
		
		   
		Bank b2=new Bank();
		   
		b2.setName("Virat");
		b2.setAccno(387468289);
		b2.setCreditedamount(100000000);
		b2.setDebitedamount(5000000);
		
      List<Bank> custDetails=Arrays.asList(b1,b2);
		
      bankRepo.saveAll(custDetails);
	}

}
