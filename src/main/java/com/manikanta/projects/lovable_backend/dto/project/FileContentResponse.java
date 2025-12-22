package com.manikanta.projects.lovable_backend.dto.project;

import java.util.List;

public record FileContentResponse(
        String path,
        String content
) {
}
