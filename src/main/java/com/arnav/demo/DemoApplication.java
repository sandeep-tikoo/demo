package com.arnav.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.BeansException;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws BeansException, InterruptedException {
		SpringApplication.run(DemoApplication.class, args);
	}

}
