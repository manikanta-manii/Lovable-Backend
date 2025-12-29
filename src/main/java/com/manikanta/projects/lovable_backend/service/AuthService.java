package com.manikanta.projects.lovable_backend.service;

import com.manikanta.projects.lovable_backend.dto.auth.AuthResponse;
import com.manikanta.projects.lovable_backend.dto.auth.LoginRequest;
import com.manikanta.projects.lovable_backend.dto.auth.SignupRequest;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;


public interface AuthService {
    AuthResponse signup(SignupRequest signupRequest);
    AuthResponse login(LoginRequest request);
}
