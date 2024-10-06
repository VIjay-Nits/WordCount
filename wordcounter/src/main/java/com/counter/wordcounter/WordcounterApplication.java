package com.counter.wordcounter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WordcounterApplication {

	public static void main(String[] args) {
		System.out.println("Hellooo");
		SpringApplication.run(WordcounterApplication.class, args);

	}

}
