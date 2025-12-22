package com.manikanta.projects.lovable_backend.service;

import com.manikanta.projects.lovable_backend.dto.auth.AuthResponce;
import com.manikanta.projects.lovable_backend.dto.auth.LoginRequest;
import com.manikanta.projects.lovable_backend.dto.auth.SignupRequest;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;


public interface AuthService {
    AuthResponce signup(SignupRequest signupRequest);
    AuthResponce login(LoginRequest request);
}
