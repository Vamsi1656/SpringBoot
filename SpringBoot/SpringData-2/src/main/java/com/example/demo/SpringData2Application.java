package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entities.Product;
import com.example.demo.repository.ProductRepo;

@SpringBootApplication
public class SpringData2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringData2Application.class, args);
		
		ProductRepo bean=ctx.getBean(ProductRepo.class);
		
		System.out.println("Bean Object"+bean.getClass().getName());
		
		Product entity=new Product();
		entity.setId(4623);
		entity.setPname("IPhone 15 Pro Max");
		entity.setPprice(150000);
		
		entity.setId(3451);
		entity.setPname("One Plus");
		entity.setPprice(45000);
		
		bean.save(entity);
		
	    ctx.close();
	}

}
