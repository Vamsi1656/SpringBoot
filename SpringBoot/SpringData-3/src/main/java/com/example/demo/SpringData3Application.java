package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entities.Company;
import com.example.demo.repository.CompanyRepo;

@SpringBootApplication
public class SpringData3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cnt=SpringApplication.run(SpringData3Application.class, args);
		
		CompanyRepo bean=cnt.getBean(CompanyRepo.class);
		
		System.out.println("BeanObj"+bean.getClass().getName());
		
		Company entity=new Company();
		
		entity.setId(101);
		entity.setName("Nani");
		entity.setSalary(450000.00);
		entity.setGender("Male");
		
		
		entity.setId(102);
		entity.setName("Virat");
		entity.setSalary(550000.00);
		entity.setGender("Male");
		
		bean.save(entity);
		
		cnt.close();
	}

}
