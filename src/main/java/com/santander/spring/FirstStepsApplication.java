package com.santander.spring;

import com.santander.spring.Domain.ViaCep.Cep;
import com.santander.spring.Domain.ViaCep.ConversorJson;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FirstStepsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstStepsApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(ConversorJson conversor) throws Exception  {
		return args -> {
			String json = "{\"cep\": \"12345\", \"log\": \"Logan Sergey\", \"local\": \"sp\"}";
			Cep response = conversor.convert(json);
			System.out.println("Cep data: " + response);
		};
	}
}


