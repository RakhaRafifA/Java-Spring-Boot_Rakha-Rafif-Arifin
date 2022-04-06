package com.rakharafifa.section29.service;

import java.util.ArrayList;
import java.util.List;

import com.rakharafifa.section29.model.Siswa;
import com.rakharafifa.section29.repository.SiswaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SiswaServiceImpl implements SiswaService {

    SiswaRepository siswaRepository;

    @Autowired
    public SiswaServiceImpl(SiswaRepository siswaRepository){
        this.siswaRepository = siswaRepository;
    }

    @Override
    public List<Siswa> getAllSiswa() {
        List<Siswa> siswa = new ArrayList<>();
        siswaRepository.findAll().forEach(siswa::add);
        return siswa;
    }

    @Override
    public Siswa getSiswaById(Long id) {
        return siswaRepository.findById(id).get();
    }

    @Override
    public Siswa create(Siswa siswa) {
        return siswaRepository.save(siswa);
    }

    @Override
    public void update(Long id, Siswa siswa) {
        Siswa siswa2 = siswaRepository.findById(id).get();
        System.out.println(siswa2.toString());
        siswa2.setNama(siswa.getNama());
        siswa2.setKelas(siswa.getKelas());
        siswaRepository.save(siswa2);
    }

    @Override
    public void delete(Long id) {
        siswaRepository.deleteById(id);  
    }
}
