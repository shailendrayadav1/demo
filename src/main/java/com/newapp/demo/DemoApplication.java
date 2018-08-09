package com.newapp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(DemoApplication.class);
		app.run(DemoApplication.class, args);

	}
}
