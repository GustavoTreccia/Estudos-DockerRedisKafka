package com.example.demo.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.KafkaProducer;

@RestController
@RequestMapping("/test")
public class KafkaTesteResource {

	private final KafkaProducer producer;

    public KafkaTesteResource(KafkaProducer producer) {
        this.producer = producer;
    }

    @GetMapping
    public String send() {
        //producer.send("Hello Kafka");
        return "Enviado";
    }
}
