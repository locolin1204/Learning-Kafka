package com.locolin.kafka_example.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "${kafka.topic.name}", groupId = "${kafka.group.id}")
    void listener(String data){
        System.out.println("Listener Received: " + data);
    }
}
