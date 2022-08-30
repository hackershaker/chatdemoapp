//package com.example.chatserver;
//
//import java.net.URI;
//
//import javax.websocket.ContainerProvider;
//import javax.websocket.Session;
//import javax.websocket.WebSocketContainer;
//
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestInstance;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@SpringBootTest
//@TestInstance(Lifecycle.PER_CLASS)
//class ChatserverApplicationTests {
//	
//	private WebSocketContainer container;
//	
//	@BeforeAll
//	public static void setup() {
//		container = ContainerProvider.getWebSocketContainer();
//	}
//
//	@Test
//	void contextLoads() throws Exception {
//		Session session = container.connectToServer(new TestEndpoint(), URI.create("wss://localhost:8443/ws/chat"));
//		
//	}
//
//}
