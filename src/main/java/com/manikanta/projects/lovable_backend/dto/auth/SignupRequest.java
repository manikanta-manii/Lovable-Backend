package com.manikanta.projects.lovable_backend.dto.auth;

public record SignupRequest(
        String name,
        String email,
        String password
) {
}
