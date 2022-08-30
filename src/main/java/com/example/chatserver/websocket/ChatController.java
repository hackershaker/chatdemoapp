//package com.example.chatserver.websocket;
//
//import org.springframework.messaging.handler.annotation.MessageMapping;
//import org.springframework.messaging.handler.annotation.Payload;
//import org.springframework.messaging.handler.annotation.SendTo;
//import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
//import org.springframework.stereotype.Controller;
//
//import com.example.chatserver.model.Message;
//
//@Controller
//public class ChatController {
//	
//	@MessageMapping("/chat.sendMessage")
//	@SendTo("/topic/public")
//	public Message sendMassage(@Payload Message message) {
//		return message;
//	}
//	
//	@MessageMapping("/chat.addUser")
//	@SendTo("topic/public")
//	public Message addUser(@Payload Message message, SimpMessageHeaderAccessor headerAccessor) {
//		headerAccessor.getSessionAttributes().put("username", message.getFrom());
//		return message;
//	}
//}
