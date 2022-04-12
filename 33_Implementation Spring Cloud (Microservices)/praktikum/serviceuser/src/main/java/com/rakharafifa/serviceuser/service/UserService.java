package com.rakharafifa.serviceuser.service;

import java.util.List;

import com.rakharafifa.serviceuser.model.User;

public interface UserService {
    List<User> getAllUser();
    User getUserById(Long id);
    User createUser(User user);
    void updateUser(Long id, User user);
    void deleteUser(Long id);
}
