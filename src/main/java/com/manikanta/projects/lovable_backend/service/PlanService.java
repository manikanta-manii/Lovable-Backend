package com.manikanta.projects.lovable_backend.service;

import com.manikanta.projects.lovable_backend.dto.subscription.PlanResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface PlanService {
    List<PlanResponse> getAllactivPlans();
}
