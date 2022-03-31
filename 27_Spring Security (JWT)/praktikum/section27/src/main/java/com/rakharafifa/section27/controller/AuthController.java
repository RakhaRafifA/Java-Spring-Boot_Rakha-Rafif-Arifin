package com.rakharafifa.section27.controller;

import com.rakharafifa.section27.model.payload.TokenResponse;
import com.rakharafifa.section27.model.payload.UsernamePassword;
import com.rakharafifa.section27.service.AuthService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    
    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody UsernamePassword usernamePassword){
        authService.register(usernamePassword);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/test")
    public ResponseEntity<?> getToken(@RequestBody UsernamePassword usernamePassword){
        TokenResponse token = authService.generateToken(usernamePassword);
        return ResponseEntity.ok(token);
    }
}
