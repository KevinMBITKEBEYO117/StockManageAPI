package com.example.stockmanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class StockManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockManageApplication.class, args);
	}

}
