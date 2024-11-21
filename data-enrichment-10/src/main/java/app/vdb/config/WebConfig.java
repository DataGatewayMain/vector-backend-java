package app.vdb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOriginPatterns("http://192.168.0.6:4200", "http://192.168.0.7:4200", "http://localhost:8080", "https://vectordb.app")  // Use patterns for origins
                .allowedMethods("GET", "POST", "PUT", "DELETE");
               
    }
}
