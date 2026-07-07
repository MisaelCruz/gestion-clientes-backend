package com.gestion.clientes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.gestion")
@EnableJpaRepositories(basePackages = "com.gestion.repositorio")
@EntityScan(basePackages = "com.gestion.entidad")
public class GestionClientesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionClientesApplication.class, args);
	}

}
