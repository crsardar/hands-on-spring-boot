package com.crsardar.java.spring.boot.rest.springbootrest;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Chittaranjan testing OpenAPI 3",
		description = "My description", version = "1.1.3",
		contact = @Contact(name = "Chittaranjan Sardar", url = "https://github.com/crsardar",
				email = "crsardar.etc@gmail.com")))
public class SpringBootRestApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootRestApplication.class, args);
	}

}
