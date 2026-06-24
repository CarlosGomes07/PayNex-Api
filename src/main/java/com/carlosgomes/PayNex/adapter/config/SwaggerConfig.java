package com.carlosgomes.PayNex.adapter.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI payNexOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("PayNex API")
                        .description("API do sistema de pagamentos PayNex")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Carlos Gomes")));
    }
}
