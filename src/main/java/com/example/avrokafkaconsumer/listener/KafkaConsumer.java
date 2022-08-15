package com.example.avrokafkaconsumer.listener;

import com.example.avro.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "my-topic", groupId = "group1")
//    public void consumeAvro(ConsumerRecord<String, User> message) {
    public void consumeAvro(User message) {
        System.out.println("Consumed AVRO message: " + message);
    }


}
