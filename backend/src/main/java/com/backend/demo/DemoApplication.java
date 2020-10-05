package com.backend.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {
	@Autowired
	private MessageRepository messageRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@PostMapping("/message")
	public @ResponseBody String createNewMessage(@RequestParam String message) {
		Message newMessage = new Message(message);
		messageRepository.save(newMessage);
		return "{\"success\": true}";
	}

	@GetMapping("/messages")
	public @ResponseBody Iterable<Message> getMessages() {
		return messageRepository.findAll();
	}
}
