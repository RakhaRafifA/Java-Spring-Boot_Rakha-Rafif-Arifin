package com.rakharafifa.sect27.service;

import com.rakharafifa.sect27.model.PhonePassword;
import com.rakharafifa.sect27.model.TokenResponse;
import com.rakharafifa.sect27.model.User;

public interface AuthService {
    User register(PhonePassword req);
    TokenResponse generateToken(PhonePassword req);
}
