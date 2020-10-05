package com.backend.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/messages")
	public MessageModel[] getMessages() {
		MessageModel[] results = new MessageModel[5];
		results[0] = new MessageModel("Message 1");
		results[1] = new MessageModel("Message 2");
		results[2] = new MessageModel("Message 3");
		results[3] = new MessageModel("Message 4");
		results[4] = new MessageModel("Message 6");
		return results;
	}
}
