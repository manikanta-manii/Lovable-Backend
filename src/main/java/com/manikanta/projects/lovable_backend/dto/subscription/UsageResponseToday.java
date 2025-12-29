package com.manikanta.projects.lovable_backend.dto.subscription;

public record UsageResponseToday(
        Integer tokensUsed,
        Integer tokensLimit,
        Integer previewsRunning,
        Integer previewsLimit
) {
}
