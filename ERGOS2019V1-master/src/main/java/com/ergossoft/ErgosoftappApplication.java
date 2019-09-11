package com.ergossoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.ergossoft.serviceorder.repository")

public class ErgosoftappApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		//System.setProperty("server.servlet.context-path", "/ergossoft");
		SpringApplication.run(ErgosoftappApplication.class, args);
	}

}
