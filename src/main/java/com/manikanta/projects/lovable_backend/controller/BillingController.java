package com.manikanta.projects.lovable_backend.controller;

import com.manikanta.projects.lovable_backend.dto.subscription.*;
import com.manikanta.projects.lovable_backend.entity.Subscription;
import com.manikanta.projects.lovable_backend.service.PlanService;
import com.manikanta.projects.lovable_backend.service.SubscriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BillingController {
  private final PlanService planService;
  private final SubscriptionService subscriptionService;

  @GetMapping("/api/plans")
  public ResponseEntity<List<PlanResponse>> getAllPlans(){
    return ResponseEntity.ok(planService.getAllactivPlans());
  }


  @GetMapping("/api/me/subscriptions")
  public ResponseEntity<SubscriptionResponse> getMySubscription(){
      return ResponseEntity.ok(subscriptionService.getCurrentSubscription(1L));
  }

  @PostMapping("/api/stripe/checkout")
  public ResponseEntity<CheckoutResponse> createCustomResponse(
          @RequestBody CheckoutRequest request
  ){
        Long userId = 1L;
        return ResponseEntity.ok(subscriptionService.createCheckoutSessionUrl(request,userId));
  }


  @PostMapping("/api/stripe/portal")
  public ResponseEntity<PortalResponse> openCustomPortal(){
      Long userId = 1L;
      return ResponseEntity.ok(subscriptionService.openCustomPortal(userId));

  }

}
