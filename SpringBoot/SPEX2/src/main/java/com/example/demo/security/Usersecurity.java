package com.example.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class Usersecurity {
	
	
	public Usersecurity() {
		System.out.println("User Security");
	}
	
	@Bean
    public Usersecurity createInstance() {
	Usersecurity us=new Usersecurity();
	
	System.out.println("User");
	return us;
	}

}
