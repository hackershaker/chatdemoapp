package com.example.chatserver.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Message {
	
	private MessageType type;
	private String from;
	private String text;
	
	
}
