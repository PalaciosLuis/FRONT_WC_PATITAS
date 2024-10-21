package pe.edu.cibertec.patitas_frontend_wc_a.config;

import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutenticacionFeingConfig {
    @Bean
    public Request.Options feignRequestOptions() {
        return new Request.Options(2000, 2000);
    }
}
