package com.chris.apachekafka.controller;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chris.apachekafka.services.KafkaProducer;
import com.chris.apachekafka.storage.MessageStorage;

@RestController
@RequestMapping(value="/kafka")
public class WebRestController {
	
	@Autowired
	KafkaProducer producer;
	
	@Autowired
	MessageStorage storage;
	
	private static final Logger logger = Logger.getLogger(WebRestController.class);
	int counter = 1;
	
	@GetMapping(value="/producer")
	public String producer(@RequestParam("data")String data){
		//counter++;
		for (int index = 0; index < 10; index++) {
            sendKafkaMessage(new Integer(index).toString(), producer, "chris-topic2");
        }
		//producer.send(data);
		
		return "Done";
	}
	
	@GetMapping(value="/consumer")
	public String getAllRecievedMessage(){
		String messages = storage.toString();
		storage.clear();
		
		return messages;
	}
	
	 private static void sendKafkaMessage(String payload,
             KafkaProducer producer,
             String topic)
    {
        logger.info("Sending Kafka message: " + payload);
        producer.send(payload);
    }
}
