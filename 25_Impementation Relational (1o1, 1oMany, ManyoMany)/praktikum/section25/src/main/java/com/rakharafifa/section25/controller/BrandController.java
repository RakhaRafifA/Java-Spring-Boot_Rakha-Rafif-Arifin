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
@RequestMapping("/rakhara")
public class BrandController {
    BrandService brandService;

    @Autowired
    public BrandController(BrandService brandService){
        this.brandService = brandService;
    }

    @GetMapping("/brand")
    public ResponseEntity<List<Brand>> getAllBrands(){
        List<Brand> brands = brandService.getAllBrand();
        return new ResponseEntity<>(brands, HttpStatus.OK);
    }

    @GetMapping("/brand/{brand_id}")
    public ResponseEntity<Brand> getBrand(@PathVariable Long brand_id){
        return new ResponseEntity<>(brandService.getBrandById(brand_id), HttpStatus.OK);
    }

    @PostMapping("/brand")
    public ResponseEntity<Brand> saveBrand(@RequestBody Brand brand){
        Brand brand2 = brandService.postBrand(brand);
        return new ResponseEntity<>(brand2, HttpStatus.CREATED);
    }

    @PutMapping("/brand/{brand_id}")
    public ResponseEntity<Brand> updateBrand(@PathVariable("brand_id") Long brand_id,@RequestBody Brand brand){
        brandService.updateBrand(brand_id, brand);
        return new ResponseEntity<>(brandService.getBrandById(brand_id), HttpStatus.OK);
    }

    @DeleteMapping("/brand/{brand_id}")
    public ResponseEntity<Brand> deleteBrand(@PathVariable("brand_id") Long brand_id) {
        brandService.deleteBrand(brand_id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
