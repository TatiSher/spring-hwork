package pro.sky.springhwork;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CartConfiguration {

    @Bean
    public Cart cart() {
        return new Cart();
    }
}
