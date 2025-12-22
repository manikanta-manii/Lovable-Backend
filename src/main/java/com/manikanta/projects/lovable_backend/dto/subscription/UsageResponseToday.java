package com.manikanta.projects.lovable_backend.dto.subscription;

public record UsageResponseToday(
        int tokensUsed,
        int tokensLimit,
        int previewsRunning,
        int previewsLimit
) {
}
