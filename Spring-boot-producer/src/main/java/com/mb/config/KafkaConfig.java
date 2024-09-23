package com.mb.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic demoTopic() {
        return TopicBuilder.name("mindbowser_topic_string")
                .build();
    }

    @Bean
    public NewTopic demoJsonTopic() {
        return TopicBuilder.name("mindbowser_topic_json")
                .build();
    }
}
