package com.manikanta.projects.lovable_backend.dto.subscription;

public record PlanResponse(
        Long id,
        String name,
        Integer maxProjects,
        Integer maxTokensPerDay,
        Boolean unlimitedTokens,
        String price
) {
}
