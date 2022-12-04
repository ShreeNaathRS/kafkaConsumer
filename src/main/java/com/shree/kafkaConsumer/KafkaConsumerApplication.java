package com.shree.kafkaConsumer;

import com.shree.kafkaConsumer.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
@Slf4j
public class KafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumerApplication.class, args);
	}

	@KafkaListener(topics = "${spring.kafka.consumer.topic}", groupId = "${spring.kafka.consumer.groupId}")
	public void consume(User user) {
		log.info("Message Consumed: {}", user);
	}

}
