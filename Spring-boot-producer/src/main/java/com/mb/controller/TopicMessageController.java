package com.mb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mb.service.TopicMessageService;

@RestController
@RequestMapping("/api/v1")
public class TopicMessageController {

    @Autowired
	private TopicMessageService messageService;
	
	@GetMapping("/publish/message")
	public ResponseEntity<String> publish(@RequestParam("message") String message) {
		messageService.sendMessage(message);
		return ResponseEntity.ok("Message send to the Topic");
	}
}
