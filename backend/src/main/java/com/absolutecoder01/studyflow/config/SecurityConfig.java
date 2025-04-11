package com.absolutecoder01.studyflow.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/users").permitAll() // 👈 publiczny endpoint
                .anyRequest().authenticated() // 👈 reszta wymaga logowania
            )
            .httpBasic(); // lub .formLogin(), w zależności jak logujesz

        return http.build();
    }
}
