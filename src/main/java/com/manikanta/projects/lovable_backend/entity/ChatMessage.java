package com.manikanta.projects.lovable_backend.entity;

import com.manikanta.projects.lovable_backend.enums.MessageRole;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class ChatMessage {
    Long id;
    ChatSession chatSession;
    String content;
    MessageRole role;
    String toolCalls; // JSON Array
    Integer tokensUsed;
    Instant createdAt;
}
