package com.rakharafifa.section35.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

@Configuration
public class TopicConfig {
    
    @Value(value = "${spring.kafka.bootstrap-servers}")
    private String bootStrapAddress;

    @Bean
    public KafkaAdmin kafkaAdmin(){
        Map<String, Object> configs = new HashMap<>();
        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, bootStrapAddress);
        return new KafkaAdmin(configs);
    }

    @Bean
    public NewTopic topic(){
        return new NewTopic("product_catalog", 0, (short)0);
    }

    @Bean
    public NewTopic topic2(){
        return new NewTopic("user", 0, (short)0);
    }

    @Bean
    public NewTopic topic3(){
        return new NewTopic("order", 0, (short)0);
    }
}
