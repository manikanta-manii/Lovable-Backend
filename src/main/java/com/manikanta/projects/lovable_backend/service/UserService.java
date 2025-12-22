package com.manikanta.projects.lovable_backend.service;

import com.manikanta.projects.lovable_backend.dto.auth.UserProfileResponse;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
