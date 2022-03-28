package com.rakharafifa.section25.service;

import java.util.List;

import com.rakharafifa.section25.entity.Brand;

public interface BrandService {
    List<Brand> getAllBrand();
    Brand getBrandById(Long brand_id);
    Brand postBrand(Brand brand_id);
    void updateBrand(Long brand_id, Brand brand);
    void deleteBrand(Long brand_id);
}
