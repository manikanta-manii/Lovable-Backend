package com.manikanta.projects.lovable_backend.dto.auth;

public record LoginRequest(
        String email,
        String password
) {
}
