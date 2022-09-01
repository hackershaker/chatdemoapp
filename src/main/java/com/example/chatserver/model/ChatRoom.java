package com.example.chatserver.model;

import java.util.UUID;

import lombok.Getter;

@Getter
public class ChatRoom {
	private String roomId;
	private String name;
//	// 채팅방에 입장한 모든 클라이언트들의 session 저장
//	private Set<WebSocketSession> sessions = new HashSet<>();
//	
//	@Builder
//	public ChatRoom(String roomId, String name) {
//		this.roomId = roomId;
//		this.name = name;
//	}
//	
//	public void handleActions(WebSocketSession session, ChatMessage chatMessage, ChatService chatService) {
//		if (chatMessage.getType().equals(chatMessage.getType().ENTER)) {
//			sessions.add(session);
//			chatMessage.setMessage(chatMessage.getSender() + "님이 입장했습니다.");
//		}
//		sendMessage(chatMessage, chatService);
//	}
//	
//	// 채팅방에 입장한 모든 클라이언트들의 session에 message 전달
//	public <T> void sendMessage(T message, ChatService chatService) {
//		sessions.parallelStream().forEach(session -> chatService.sendMessage(session, message));
//	}
	
	public static ChatRoom create(String name) {
		ChatRoom chatRoom = new ChatRoom();
		chatRoom.roomId = UUID.randomUUID().toString();
		chatRoom.name = name;
		return chatRoom;
	}
}
