package com.studywithme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableMethodSecurity
@EnableTransactionManagement
public class StudywithmeApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudywithmeApplication.class, args);
	}

}
