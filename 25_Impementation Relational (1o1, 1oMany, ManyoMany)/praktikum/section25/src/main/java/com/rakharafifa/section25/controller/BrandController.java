package com.rakharafifa.section25.controller;

import java.util.List;

import com.rakharafifa.section25.entity.Brand;
import com.rakharafifa.section25.service.BrandService;

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
@RequestMapping("/rakhara/brand")
public class BrandController {
    BrandService brandService;

    @Autowired
    public BrandController(BrandService brandService){
        this.brandService = brandService;
    }

    @GetMapping
    public ResponseEntity<List<Brand>> getAllBrands(){
        List<Brand> brands = brandService.getAllBrand();
        return new ResponseEntity<>(brands, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Brand> getBrand(@PathVariable("id") Long id){
        return new ResponseEntity<>(brandService.getBrandById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Brand> saveBrand(@RequestBody Brand brand){
        Brand brand2 = brandService.postBrand(brand);
        return new ResponseEntity<>(brand2, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Brand> updateBrand(@PathVariable("id") Long id,@RequestBody Brand brand){
        brandService.updateBrand(id, brand);
        return new ResponseEntity<>(brandService.getBrandById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Brand> deleteBrand(@PathVariable("id") Long id) {
        brandService.deleteBrand(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
