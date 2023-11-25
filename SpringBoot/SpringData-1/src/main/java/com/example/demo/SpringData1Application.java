package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entities.Orders;
import com.example.demo.repository.ProductRepo;

@SpringBootApplication
public class SpringData1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cnxt=SpringApplication.run(SpringData1Application.class, args);
		
		ProductRepo bean=cnxt.getBean(ProductRepo.class);
		
		System.out.println("++++++++++"+bean.getClass().getName());
		
		Orders entity=new Orders();
		
		entity.setId(574951);
		entity.setPname("OnePlus Nord CE 3Lite");
		entity.setPprice(20000);
		
		bean.save(entity);
		cnxt.close();
		
	}

}
