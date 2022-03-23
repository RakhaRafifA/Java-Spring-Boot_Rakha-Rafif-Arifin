package com.rakharafifa.section22.repository;

import com.rakharafifa.section22.entitites.Gudang;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GudangRepository extends JpaRepository<Gudang, Long> {
    
}
