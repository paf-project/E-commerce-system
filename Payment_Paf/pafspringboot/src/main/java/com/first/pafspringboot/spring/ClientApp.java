package com.first.pafspringboot.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing

public class ClientApp {
	
	public static void main (String args)
	{
		SpringApplication.run(ClientApp.class, args);
		
	}

}
