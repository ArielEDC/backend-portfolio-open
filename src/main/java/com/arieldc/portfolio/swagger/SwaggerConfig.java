package com.arieldc.portfolio.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    OpenAPI customOpenAPI(){
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Portafolio Web: CRUD y Autenticación JWT")
                                .version("0.1.1")
                                .description("Documentación de la API desarrollada por Ariel Díaz Carreño.")
                );
    }

}
