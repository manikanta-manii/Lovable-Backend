package com.manikanta.projects.lovable_backend.entity;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class UsageLog {
    Long id;
    Project project;
    User user;
    String action;
    Integer tokensUsed;
    Integer durationMS;
    String metaData; // JSON of  { modal_uses, prompt_uses }
    Instant createdAt;
}
