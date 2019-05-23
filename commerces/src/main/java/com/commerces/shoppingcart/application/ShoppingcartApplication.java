package com.commerces.shoppingcart.application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ShoppingcartApplication {
public static void main(String args[]) {
SpringApplication.run(ShoppingcartApplication.class, args);
}
}