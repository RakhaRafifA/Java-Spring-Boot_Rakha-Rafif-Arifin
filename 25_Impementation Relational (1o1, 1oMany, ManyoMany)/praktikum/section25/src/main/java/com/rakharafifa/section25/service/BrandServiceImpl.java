package com.rakharafifa.section25.service;

import java.util.ArrayList;
import java.util.List;

import com.rakharafifa.section25.entity.Brand;
import com.rakharafifa.section25.repository.BrandRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl implements BrandService {
    BrandRepository brandRepository;

    @Autowired
    public BrandServiceImpl(BrandRepository brandRepository){
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAllBrand(){
        List<Brand> brands = new ArrayList<>();
        brandRepository.findAll().forEach(brands::add);
        return brands;
    }

    @Override
    public Brand getBrandById(Long brand_id){
        return brandRepository.findById(brand_id).get();
    }

    @Override
    public Brand postBrand(Brand brand){
        return brandRepository.save(brand);
    }

    @Override
    public void updateBrand(Long brand_id, Brand brand){
        Brand brands = brandRepository.findById(brand_id).get();
        System.out.println(brands.toString());
        brands.setBrand_name(brand.getBrand_name());
        brandRepository.save(brands);
    }

    @Override
    public void deleteBrand(Long brand_id){
        brandRepository.deleteById(brand_id);
    }
}
