package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entities.Type;
import com.example.services.MotService;
import com.example.services.TypeService;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class BaseDeDonneesBelcelApplication implements CommandLineRunner {

	private final MotService motService;
	private final TypeService typeService;

	public static void main(String[] args) {
		SpringApplication.run(BaseDeDonneesBelcelApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// departamentos
		Type type1 = Type.builder()
			.type("NOM")
			.build();
		
		Type type2 = Type.builder()
			.type("ADJ")
			.build();
		
		Type type3 = Type.builder()
			.type("ADV")
			.build();
		
		Type type4 = Type.builder()
			.type("AUTRES")
			.build();

	typeService.persisterUnType(type1);
	typeService.persisterUnType(type2);
	typeService.persisterUnType(type3);
	typeService.persisterUnType(type4);

	}

}
