package com.restaurent.management;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoodItemApplicationService {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();
		System.setProperty("RESTAURANT_KEYSTORE_PATH", dotenv.get("RESTAURANT_KEYSTORE_PATH"));
		System.setProperty("RESTAURANT_KEYSTORE_PASSWD", dotenv.get("RESTAURANT_KEYSTORE_PASSWD"));
		SpringApplication.run(FoodItemApplicationService.class, args);
	}

}
