package com.rakharafifa.section25.service;

import static org.mockito.Mockito.when;

import java.security.Provider.Service;
import java.util.Optional;

import com.rakharafifa.section25.repository.ProductRepository;

import org.jeasy.random.EasyRandom;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.configuration.MockAnnotationProcessor;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import lombok.var;

@ExtendWith(SpringExtension.class)
public class ProductServiceImplTest {
    private final EasyRandom EASY_RANDOM = new EasyRandom();
    private Long id;

    @InjectMocks
    private ProductServiceImpl productServiceImpl;
    @Mock
    private ProductRepository productRepository;

    @Test
    public void getOne_ReturnNull(){
        when(productRepository.findById(id)).thenReturn(Optional.empty());
        var result = productServiceImpl.findById(id);
;    }
} 
