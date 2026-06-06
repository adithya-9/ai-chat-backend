package com.example.demo.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

	private ChatClient chatclient;

	public ChatService(ChatClient chatclient) {
		this.chatclient = chatclient;
	}

	public String getMessage(String Question) {
		return chatclient.prompt(Question).call().content();

	}

}
