package com.springinaction.knights.config;

import com.springinaction.knights.BraveKnight;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {
    @Bean
    public com.springinaction.knights.Knight knight() {
        return new BraveKnight(quest());
    }
    @Bean
    public com.springinaction.knights.Quest quest() {
        return new com.springinaction.knights.SlayDragonQuest(System.out);
    }
}