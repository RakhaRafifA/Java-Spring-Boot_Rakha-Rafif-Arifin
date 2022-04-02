package com.rakharafifa.sect27.controller;

import com.rakharafifa.sect27.model.PhonePassword;
import com.rakharafifa.sect27.model.TokenResponse;
import com.rakharafifa.sect27.service.AuthService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("v2/auth")
@RequiredArgsConstructor
public class AuthController {
    
    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody PhonePassword phonePassword){
        authService.register(phonePassword);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody PhonePassword phonePassword){
        TokenResponse token = authService.generateToken(phonePassword);
        return ResponseEntity.ok(token);
    }
}
