package com.twoja_nazwa_aplikacji.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                // Dodajemy regułę CORS, zezwalając na zapytania z frontendowej aplikacji React
                registry.addMapping("/**")
                        .allowedOrigins("http://localhost:5173") // URL Twojej aplikacji React
                        .allowedMethods("*") // Zezwala na wszystkie metody HTTP (GET, POST, PUT, DELETE itd.)
                        .allowedHeaders("*"); // Zezwala na wszystkie nagłówki
            }
        };
    }
}
