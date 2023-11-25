package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpexApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpexApplication.class, args);
		
		System.out.println(context.getClass().getName());
		
		System.out.println("Beans Loaded:"+context.getBeanDefinitionCount());
		
//		System.out.println("Hello,Good Morning");
	}
	
//	@GetMapping("/	vamsi")
//	public String get() {
//		return "Virat Kohli - The King of Cricket in the world";
//		
		
		
//	}

	

}
