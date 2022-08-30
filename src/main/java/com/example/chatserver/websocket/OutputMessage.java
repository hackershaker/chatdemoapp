package com.example.chatserver.websocket;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class OutputMessage {
	@NonNull
	private String from;
	@NonNull
	private String text;
	@NonNull
	private String time;

}
