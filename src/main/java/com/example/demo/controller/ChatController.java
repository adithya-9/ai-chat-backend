package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ChatService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/ai/v2")
public class ChatController {

	private final ChatService chatService;

	public ChatController(ChatService chatService) {
		this.chatService = chatService;
	}

	@PostMapping("/ask")
	public String askQuestion(@RequestBody String question) {
		log.info("Starting the AI calling..");
		return chatService.getMessage(question);
	}

}
