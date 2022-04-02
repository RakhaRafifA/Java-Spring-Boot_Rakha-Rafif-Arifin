package com.rakharafifa.sect27.service;

import com.rakharafifa.sect27.model.User;
import com.rakharafifa.sect27.repository.UserRepository;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String phone) throws UsernameNotFoundException {
        User user = userRepository.getDistinctByUsername(phone);
        if (user == null)
        throw new UsernameNotFoundException("Username not Found");
        return user;
    }
}
