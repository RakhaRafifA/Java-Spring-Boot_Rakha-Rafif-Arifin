package com.rakharafifa.section25.product;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.rakharafifa.section25.model.Product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@AutoConfigureMockMvc
@ActiveProfiles("products")
@SpringBootTest
public class ProductControllerTest {
    
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testProduct() throws Exception {
        RequestBuilder builder = MockMvcRequestBuilders
            .get("/products")
            .contentType(MediaType.APPLICATION_JSON)
            .accept(MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc
            .perform(builder)
            .andReturn();
        
        assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    public void createProduct() throws Exception{
        Product product = new Product();
            product.setId("507f1f77bcf86cd799439011");
            product.setName("whiskas");
            product.setPrice(1000);
        
        RequestBuilder builder = MockMvcRequestBuilders
            .post("/products")
            .contentType(MediaType.APPLICATION_JSON)
            .accept(MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc
            .perform(builder)
            .andReturn();
        
        assertEquals(201, result.getResponse().getStatus());
    }

    @Test
    public void getProductById() throws Exception{
        Product product = new Product();
            product.setId("507f1f77bcf86cd799439011");
            product.setName("whiskas");
            product.setPrice(1000);
        
        RequestBuilder builder = MockMvcRequestBuilders
            .get("/products/507f1f77bcf86cd799439011")
            .contentType(MediaType.APPLICATION_JSON)
            .accept(MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc
            .perform(builder)
            .andReturn();
        
        assertEquals(200, result.getResponse().getStatus());
    }
}
