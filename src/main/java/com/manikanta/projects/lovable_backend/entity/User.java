package com.manikanta.projects.lovable_backend.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;


@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class User {

    Long id;
    String avatarUrl;
    String name;
    String email;
    String passwordHash;
    Instant createdAt; // or LocalDateTime createdAt
    Instant updatedAt; // or LocalDateTime updatedAt
    Instant deletedAt; // or LocalDateTime deletedAt // soft delete indicator
}
