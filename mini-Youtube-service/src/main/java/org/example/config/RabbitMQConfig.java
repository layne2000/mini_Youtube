package org.example.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
    @Bean
    public Queue momentsQueue(){
        return new Queue("momentsQueue");
    }

    @Bean
    public Queue liveCommentsQueue(){
        return new Queue("liveCommentsQueue");
    }
}
