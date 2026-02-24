package com.example.demo.services;

//import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

	/*@KafkaListener(topics = "hello-topic", groupId = "dev-group")
    public void listen(String message) {
        System.out.println("Recebido: " + message);
    }*/
}
