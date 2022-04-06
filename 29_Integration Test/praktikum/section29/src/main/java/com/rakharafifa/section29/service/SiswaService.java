package com.rakharafifa.section29.service;

import java.util.List;

import com.rakharafifa.section29.model.Siswa;


public interface SiswaService {
    List<Siswa> getAllSiswa();
    Siswa getSiswaById(Long id);
    Siswa create(Siswa siswa);
    void update(Long id, Siswa siswa);
    void delete(Long id);
}
