package com.advocacia.api.infra.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:4200", "http://localhost:4300", "https://advocacia-associados.netlify.app", "https://advocacia-associados2.netlify.app")
                .allowedMethods("GET", "POST", "DELETE", "PUT")
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}