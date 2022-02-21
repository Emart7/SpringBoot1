package co.com.exercise.spring.introduction.config;

import co.com.exercise.spring.introduction.services.Calculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public Calculator configCalculator(){
        System.out.println("Creating bean calculator");
        return new Calculator();
    }
}
