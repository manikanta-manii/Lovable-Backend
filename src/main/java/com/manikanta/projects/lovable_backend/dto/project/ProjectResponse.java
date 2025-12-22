package com.manikanta.projects.lovable_backend.dto.project;

import com.manikanta.projects.lovable_backend.dto.auth.UserProfileResponse;

import java.time.Instant;

public record ProjectResponse(
        Long id,
        String name,
        Instant createdAt,
        Instant updatedAt,
        UserProfileResponse owner
) {
}
