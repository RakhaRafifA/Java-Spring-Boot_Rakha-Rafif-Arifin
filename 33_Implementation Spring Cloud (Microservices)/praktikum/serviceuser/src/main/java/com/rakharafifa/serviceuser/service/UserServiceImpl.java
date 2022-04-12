package com.rakharafifa.serviceuser.service;

import java.util.ArrayList;
import java.util.List;

import com.rakharafifa.serviceuser.model.User;
import com.rakharafifa.serviceuser.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUser() {
       List<User> users = new ArrayList<>();
       userRepository.findAll().forEach(users::add); 
        return users;
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void updateUser(Long id, User user) {
        User user2 = userRepository.findById(id).get();
        System.out.println(user.toString());
        user2.setName(user.getName());
        user2.setDomisili(user.getDomisili());
        userRepository.save(user2);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
    
}
