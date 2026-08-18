package com.sonumangal.tech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DynamicConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DynamicConfigServerApplication.class, args);
	}

}
