package com.rakharafifa.section27.service;

import com.rakharafifa.section27.model.User;
import com.rakharafifa.section27.model.payload.TokenResponse;
import com.rakharafifa.section27.model.payload.UsernamePassword;

public interface AuthService {
    User register(UsernamePassword req);
    TokenResponse generateToken(UsernamePassword req);
}
