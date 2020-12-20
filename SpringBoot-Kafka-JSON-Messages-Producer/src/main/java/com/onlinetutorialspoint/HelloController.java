package com.onlinetutorialspoint;

import com.onlinetutorialspoint.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("producer")
public class HelloController {

    @Autowired
    KafkaTemplate<String, Item> KafkaJsontemplate;
    String TOPIC_NAME = "chris-topic";

    @PostMapping(value = "postItem",consumes = {"application/json"},produces = {"application/json"})
    public String postJsonMessage(@RequestBody Item item){
        KafkaJsontemplate.send(TOPIC_NAME,item);
        return "Message published successfully";
    }
}
