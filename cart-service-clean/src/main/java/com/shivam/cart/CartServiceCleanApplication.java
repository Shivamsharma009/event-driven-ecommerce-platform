package com.shivam.cart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {
		org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class
})
public class CartServiceCleanApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartServiceCleanApplication.class, args);
	}

}
