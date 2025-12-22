package com.manikanta.projects.lovable_backend.dto.project;

import java.time.Instant;

public record FileNode(
        String path,
        Instant ModifiedAt,
        Long size,
        String type
) {
}
