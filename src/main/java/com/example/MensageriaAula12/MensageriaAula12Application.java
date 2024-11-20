package com.example.MensageriaAula12;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MensageriaAula12Application implements CommandLineRunner {
	private final Producer producer;

	public MensageriaAula12Application(Producer producer){
		this.producer = producer;
	}

	public static void main(String[] args) {
		SpringApplication.run(MensageriaAula12Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		producer.sendMassiveMessages();
	}
}
