package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.security.Usersecurity;

@SpringBootApplication
@ComponentScan(basePackages= {"com.example.demo","com.wallmart"})
@RestController
public class SpexApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpexApplication.class, args);
		
		System.out.println(context.getClass().getName());
		
		System.out.println("Beans Loaded:"+context.getBeanDefinitionCount());
		
		
		}
//	
//	@Bean
//	    public Usersecurity createInstance() {
//		Usersecurity us=new Usersecurity();
//		
//		// custom logic
//		return us;
//		
//		System.out.println("Hello,Good Morning");
//	}
	
	
	
//	@GetMapping("/	vamsi")
//	public String get() {
//		return "Virat Kohli - The King of Cricket in the world";
//		
		
		
//	}



}
