package com.manikanta.projects.lovable_backend.dto.subscription;

import com.manikanta.projects.lovable_backend.entity.Plan;
import com.manikanta.projects.lovable_backend.entity.User;
import com.manikanta.projects.lovable_backend.enums.SubscriptionStatus;

import java.time.Instant;

public record SubscriptionResponse(
        PlanResponse plan,
        String status,
        Instant periodEnd,
        Long tokensUsedThisCycle

) {
}
