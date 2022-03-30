package com.rakharafifa.section27.controller;

import com.rakharafifa.section27.model.payload.UsernamePassword;
import com.rakharafifa.section27.service.AuthService;

import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v2")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/auth/login")
    public ResponseEntity<?> register(@RequestBody UsernamePassword req){
        authService.register(req);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/auth/token")
    public ResponseEntity<?> generateToken(@RequestBody UsernamePassword req){
        return ResponseEntity.ok(authService.generateToken(req));
    }
}
