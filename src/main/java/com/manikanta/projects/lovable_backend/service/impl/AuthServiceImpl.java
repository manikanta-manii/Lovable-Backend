package com.manikanta.projects.lovable_backend.service.impl;

import com.manikanta.projects.lovable_backend.dto.auth.AuthResponse;
import com.manikanta.projects.lovable_backend.dto.auth.LoginRequest;
import com.manikanta.projects.lovable_backend.dto.auth.SignupRequest;
import com.manikanta.projects.lovable_backend.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public AuthResponse signup(SignupRequest signupRequest) {
        return null;
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        return null;
    }
}
