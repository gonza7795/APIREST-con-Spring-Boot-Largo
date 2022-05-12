package com.ecodeup.api.API2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication (exclude = DataSourceAutoConfiguration.class)

@SpringBootApplication (exclude = DataSourceAutoConfiguration.class)
public class Api2Application {

	public static void main(String[] args) {
		SpringApplication.run(Api2Application.class, args);
	}

}
