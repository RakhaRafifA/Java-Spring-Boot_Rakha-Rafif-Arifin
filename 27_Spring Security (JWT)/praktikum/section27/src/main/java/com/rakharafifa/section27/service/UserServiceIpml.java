package com.rakharafifa.section27.service;

import com.rakharafifa.section27.model.User;
import com.rakharafifa.section27.repository.UserRepository;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceIpml implements UserService {

    private final UserRepository userRepository;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.getDistinctTopByUsername(username);
        if (user == null)
        throw new UsernameNotFoundException("Username not Found");
        return user;
    }
    
}
