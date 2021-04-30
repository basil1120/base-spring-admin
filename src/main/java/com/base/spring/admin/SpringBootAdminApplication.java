package com.base.spring.admin;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAdminServer
public class SpringBootAdminApplication {

	public static void main(String[] args) {
		//SpringApplication.run(KcbPesalinkAdminApplication.class, args);
	      new SpringApplicationBuilder(SpringBootAdminApplication.class)
          .web(WebApplicationType.REACTIVE)
          .run(args);
	}	

}
