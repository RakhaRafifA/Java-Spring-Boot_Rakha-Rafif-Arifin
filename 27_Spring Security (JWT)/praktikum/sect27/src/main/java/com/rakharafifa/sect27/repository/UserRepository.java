package com.rakharafifa.sect27.repository;

import com.rakharafifa.sect27.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User getDistinctByUsername(String phone);
}
