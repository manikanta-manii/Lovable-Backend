package com.manikanta.projects.lovable_backend.service;

import com.manikanta.projects.lovable_backend.dto.subscription.PlanLimitsResponse;
import com.manikanta.projects.lovable_backend.dto.subscription.UsageResponseToday;

public interface UsageService {
    UsageResponseToday getTodayUsageOfUser(Long userId);
    PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
