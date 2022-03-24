package com.abhishek.payroll.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "NewTopic", groupId = "group_id_2")
    public void consume(String message)
    {
        System.out.println("message = " + message);
    }
}