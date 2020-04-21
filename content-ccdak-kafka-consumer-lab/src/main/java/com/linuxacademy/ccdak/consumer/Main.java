package com.linuxacademy.ccdak.consumer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

public class Main {

   public static void main(String[] args) {
       Properties props = new Properties();
       props.setProperty("bootstrap.servers", "localhost:9092");
       props.setProperty("group.id", "test-consumer-group-1");
       props.setProperty("enable.auto.commit", "true");
       props.setProperty("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
       props.setProperty("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
       KafkaConsumer<String, String> consumer = new KafkaConsumer<>(props);
       consumer.subscribe(Arrays.asList("chris-topic"));
       try {
           BufferedWriter writer = new BufferedWriter(new FileWriter("c:/kafka/output.dat", true));
           while (true) {
               ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));
               for (ConsumerRecord<String, String> record : records) {
                   String recordString = "key=" + record.key() + ", value=" + record.value() + ", topic=" + record.topic() + ", partition=" + record.partition() + ", offset=" + record.offset();
                   System.out.println(recordString);
                   writer.write(recordString + "\n");
               }
               consumer.commitSync();
               writer.flush();
           }
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
   }

}