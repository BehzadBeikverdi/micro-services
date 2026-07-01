package com.stringwavetech.student.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    private static final String SECURITY_SCHEME_NAME = "bearerAuth";

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                // --- Add global security requirement ---
                .addSecurityItem(new SecurityRequirement().addList(SECURITY_SCHEME_NAME))
                // --- Define the security scheme ---
                .components(new Components()
                        .addSecuritySchemes(SECURITY_SCHEME_NAME,
                                new SecurityScheme()
                                        .name(SECURITY_SCHEME_NAME)
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")
                        )
                )
                // --- API general info ---
                .info(new Info()
                                .title("Students Service")
                                .version("1.0.0")
                                .description("""
                                        Students service by BehzaDevStack
                                        
                                        Contacts:
                                        - [Behzad Beikverdi - Fullstack-Devloper](mailto:behzadevstack@gmail.com)
                                        """)
                ).addServersItem(new Server()
                        .url("http://localhost:8222")
                        .description("Dev")
                );

    }

}
