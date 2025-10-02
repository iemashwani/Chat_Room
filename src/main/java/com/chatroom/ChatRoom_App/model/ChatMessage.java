package com.chatroom.ChatRoom_App.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ChatMessage {
    private Long id;
    private String message;
    private String content;
}
