package com.locolin.kafka_example.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic colinTopic() {
        return TopicBuilder
                .name("${kafka.topic.name}")
                .build();
    }
}
