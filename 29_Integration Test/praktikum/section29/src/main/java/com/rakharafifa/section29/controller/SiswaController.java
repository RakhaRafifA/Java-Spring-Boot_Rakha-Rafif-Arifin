package com.rakharafifa.section29.controller;

import java.util.List;

import com.rakharafifa.section29.model.Siswa;
import com.rakharafifa.section29.service.SiswaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rakha/section29")
public class SiswaController {
    SiswaService siswaService;

    @Autowired
    public SiswaController(SiswaService siswaService){
        this.siswaService = siswaService;
    }

    @GetMapping
    public ResponseEntity<List<Siswa>> getAllSiswa(){
        List<Siswa> siswas = siswaService.getAllSiswa();
        return new ResponseEntity<>(siswas, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Siswa> getSiswaById(@PathVariable("id") Long id){
        return new ResponseEntity<>(siswaService.getSiswaById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Siswa> create(@RequestBody Siswa siswa){
        Siswa siswa2 = siswaService.create(siswa);
        return new ResponseEntity<>(siswa2, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Siswa> update(@PathVariable("id") Long id, @RequestBody Siswa siswa){
        siswaService.update(id, siswa);
        return new ResponseEntity<>(siswaService.getSiswaById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Siswa> delete(@PathVariable("id") Long id){
        siswaService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
