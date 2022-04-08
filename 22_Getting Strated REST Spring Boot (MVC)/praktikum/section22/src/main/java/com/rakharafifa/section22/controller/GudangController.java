package com.rakharafifa.section22.controller;

import java.util.List;
import java.util.Optional;

import com.rakharafifa.section22.entitites.Gudang;
import com.rakharafifa.section22.repository.GudangRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1")
public class GudangController {
    @Autowired
    private GudangRepository gudangRepository;

    @GetMapping("/posts")
    public List<Gudang> getAllGudang(){
        return gudangRepository.findAll();
    }

    @GetMapping("/posts/{id}")
    public Optional<Gudang> getDetailGudang(@PathVariable Long id){
        return gudangRepository.findById(id);
    }

    @PostMapping("/posts")
    public Gudang createNewGudang(@RequestBody Gudang barang){
        return gudangRepository.save(barang);
    }

    @PutMapping("/posts/{id}")
    public Optional<Gudang> updateGudang(@PathVariable Long id, @RequestBody Gudang gudang){
        Optional<Gudang> gudangById = gudangRepository.findById(id);
        gudangById.ifPresent(res -> {
            res.setNama(gudang.getNama());
            res.setDescription(gudang.getDescription());
            gudangRepository.save(res);
        });
        return gudangById;
    }

    @DeleteMapping("/posts/{id}")
    public void deleteGudang(@PathVariable Long id){
        Optional<Gudang> gudangById = gudangRepository.findById(id);
        gudangById.ifPresent(res -> {
            gudangRepository.delete(res);
        });
    }
}
