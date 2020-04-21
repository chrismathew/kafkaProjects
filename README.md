# kafkaProjectsSOMETHING CHANGED IN KAFKA
https://www.onlinetutorialspoint.com/spring-boot/sending-spring-boot-kafka-json-message-to-kafka-topic.html

https://www.javainuse.com/spring/spring-boot-apache-kafka-hello-world

https://www.sohamkamani.com/blog/2017/11/22/how-to-install-and-run-kafka/

https://www.confluent.io/blog/apache-kafka-spring-boot-application/


GITBASH
--------------------------------
$ ./bin/windows/zookeeper-server-start.bat config/zookeeper.properties
$ ./bin/windows/kafka-server-start.bat config/server.properties
./bin/windows/kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic chris-topic
./bin/windows/kafka-console-producer.bat --broker-list localhost:9092 --topic chris-topic
./bin/windows/kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic chris-topic

server.properties
listeners=PLAINTEXT://:9092

zookeeper
dataDir=c:/tmp/zookeeper
