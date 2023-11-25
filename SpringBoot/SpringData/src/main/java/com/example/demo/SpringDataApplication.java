package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entities.Student;
import com.example.demo.repository.StudentRepo;

@SpringBootApplication
public class SpringDataApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt= SpringApplication.run(SpringDataApplication.class, args);
		
		StudentRepo bean=ctxt.getBean(StudentRepo.class);
		System.out.println("+++++++++++=="+ bean.getClass().getName());
		
		Student entity=new Student();
		entity.setId(101);
		entity.setName("Nani");
		entity.setMarks(85);
		
		bean.save(entity);
		
		ctxt.close();
	}

}
