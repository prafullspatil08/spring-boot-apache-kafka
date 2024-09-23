package com.mb.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.mb.model.UserModel;

@Service
public class TopicJsonService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TopicJsonService.class);

    @KafkaListener(topics = "mindbowser_topic_json", groupId = "myGroup")
    public void consume(UserModel model) {
        LOGGER.info(String.format("Json Message received -> %s", model.toString()));

    }
}
