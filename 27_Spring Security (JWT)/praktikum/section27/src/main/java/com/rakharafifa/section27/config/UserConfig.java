/* package com.rakharafifa.section27.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserConfig {
    
    @Bean
    public UserDetailsService users(){
        UserDetails admin = User.builder()
            .username("admin")
            .password("{noop}password")
            .roles("ADMIN")
            .build();

            UserDetails user = User.builder()
            .username("user")
            .password("{bcrypt}$2a$10$5j21h7ZPIlEw1va2gsDitu9x4wRN2g5TRFjjg2Gndxz11scvQHXN6")
            .roles("USER")
            .build();

        return new InMemoryUserDetailsManager(admin, user);
    }
}
*/