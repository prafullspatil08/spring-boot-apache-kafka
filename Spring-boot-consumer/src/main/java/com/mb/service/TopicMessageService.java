package com.mb.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class TopicMessageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TopicJsonService.class);

    @KafkaListener(topics = "mindbowser_topic_string", groupId = "myGroup")
    public void consume(String message) {
        LOGGER.info(String.format("Json Message received -> %s", message));

    }
}
