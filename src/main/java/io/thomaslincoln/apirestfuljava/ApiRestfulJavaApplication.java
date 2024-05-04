package io.thomaslincoln.apirestfuljava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"io.thomaslincoln.apirestfuljava", 
	"io.thomaslincoln.apirestfuljava.repository"})
public class ApiRestfulJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestfulJavaApplication.class, args);
	}

}
