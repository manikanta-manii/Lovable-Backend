package com.manikanta.projects.lovable_backend.controller;


import com.manikanta.projects.lovable_backend.dto.subscription.PlanLimitsResponse;
import com.manikanta.projects.lovable_backend.dto.subscription.UsageResponseToday;
import com.manikanta.projects.lovable_backend.service.UsageService;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/usage")
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class UsageController {
    UsageService usageService;

    @GetMapping("/today")
    public ResponseEntity<UsageResponseToday> getTodayUsage(){
        Long userId=1L;
        return ResponseEntity.ok(usageService.getTodayUsageOfUser(userId));
    }

    @GetMapping("/limits")
    public ResponseEntity<PlanLimitsResponse> getPlansLimits(){
        Long userId=1L;
        return ResponseEntity.ok(usageService.getCurrentSubscriptionLimitsOfUser(userId));
    }
}
