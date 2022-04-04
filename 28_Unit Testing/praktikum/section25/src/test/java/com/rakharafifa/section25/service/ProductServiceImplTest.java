package com.rakharafifa.section25.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import com.rakharafifa.section25.model.Product;
import com.rakharafifa.section25.repository.ProductRepository;

import org.jeasy.random.EasyRandom;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.modelmapper.ModelMapper;


public class ProductServiceImplTest {

    private static EasyRandom easyRandom = new EasyRandom();
    private static ModelMapper modelMapper = new ModelMapper();

    @InjectMocks
    private ProductServiceImpl productServiceImpl;

    @Mock
    private ProductRepository productRepository;

    @Spy
    private ModelMapper mapper = new ModelMapper();

    @Test
    void testCreate() {
        //given
        Product product = easyRandom.nextObject(Product.class);
        
        //when
        assertEquals(product.getId(), product.getId());
        assertNotNull(product.getId());

        //then
        productServiceImpl.create(product);
        verify(productRepository).save(product);
    }

    @Test
    void testDelete() {
        Product product = easyRandom.nextObject(Product.class);
        when(productRepository.findById(product.getId())).thenReturn(Optional.of(product));

        
    }

    @Test
    void testFindAll() {

    }

    @Test
    void testFindById() {

    }

    @Test
    void testUpdate() {

    }
}
