package com.dpviacep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DpviacepApplication {

	public static void main(String[] args) {
		SpringApplication.run(DpviacepApplication.class, args);
	}

}
