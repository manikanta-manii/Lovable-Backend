package com.manikanta.projects.lovable_backend.dto.auth;

// make dtos as record to make it immutable or make class and make it private
public record AuthResponse(
        String token,
        UserProfileResponse UserProfileResponse) {
}
