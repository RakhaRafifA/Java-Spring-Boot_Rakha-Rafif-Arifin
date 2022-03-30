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
            .password("{bcrypt}$2a$12$ZmOh7rJEuh7WkPW4mfhfleQHBEEX5P/0Ba4emn6DFuH21CJ9xK0Fy")
            .roles("USER")
            .build();
        
        return new InMemoryUserDetailsManager(admin, user);
    }
}
*/
