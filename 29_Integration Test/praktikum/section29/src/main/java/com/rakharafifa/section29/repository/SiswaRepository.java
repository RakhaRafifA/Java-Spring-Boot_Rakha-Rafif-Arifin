package com.rakharafifa.section29.repository;

import com.rakharafifa.section29.model.Siswa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiswaRepository extends JpaRepository<Siswa, Long> {
    
}
