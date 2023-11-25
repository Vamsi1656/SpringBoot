package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Nani;
import com.example.demo.repository.NaniRepo;

@SpringBootApplication
public class SpringData4Application implements CommandLineRunner {
	
	@Autowired
	NaniRepo nanirepo;

	public static void main(String[] args)  {
		
		SpringApplication.run(SpringData4Application.class, args);
		}
		
//		NaniRepo bean=cnt.getBean(NaniRepo.class);
//		
//		System.out.println("BeanObj"+bean.getClass().getName());
//		
		

	@Override
	public void run(String... args) throws Exception {
		Nani st1=new Nani();
		st1.setId(101);
		st1.setName("Pallavi");
		st1.setSalary(45000.00);
		st1.setAge(28);
		
		Nani st2=new Nani();
		st2.setId(102);
		st2.setName("Sam");
		st2.setSalary(55000.00);
		st2.setAge(30);
		
		Nani st3=new Nani();
		st3.setId(103);
		st3.setName("Anu");
		st3.setSalary(65000.00);
		st3.setAge(30);
		
		Nani st4=new Nani();
		st4.setId(104);
		st4.setName("Kitty");
		st4.setSalary(65000.00);
		st4.setAge(30);
		
		List<Nani> listofemp=Arrays.asList(st1,st2,st3,st4);
		
		nanirepo.saveAll(listofemp);
	
	
//		Optional<Nani> employee=nanirepo.findById(102);
//		
//		System.out.println(employee.get());
		
//		Nani nani=nanirepo.findById(102).get();
//		nani.setName("Kaj");
//		
//		nanirepo.save(nani);
//		System.out.println("Updated");
		
		nanirepo.delete(st3);
		System.out.println("Deleted");
		
	}

}
