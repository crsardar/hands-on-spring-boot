package com.crsardar.sprinjparest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com"})
@EnableJpaRepositories
public class SprinJpaRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprinJpaRestApplication.class, args);
	}

}
