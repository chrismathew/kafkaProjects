https://medium.com/trendyol-tech/how-to-integration-test-on-spring-kafka-producer-cb9d1caf0795

# kafkaProjectsSOMETHING CHANGED IN KAFKA
https://www.onlinetutorialspoint.com/spring-boot/sending-spring-boot-kafka-json-message-to-kafka-topic.html

https://www.javainuse.com/spring/spring-boot-apache-kafka-hello-world


https://www.sohamkamani.com/blog/2017/11/22/how-to-install-and-run-kafka/ 

https://www.confluent.io/blog/apache-kafka-spring-boot-application/ 

https://www.onlinetutorialspoint.com/spring-boot/sending-spring-boot-kafka-json-message-to-kafka-topic.html  

https://codenotfound.com/blog/


https://medium.com/talking-tech-all-around/how-to-enable-and-verify-client-authentication-in-kafka-21e936e670e8

https://docs.confluent.io/2.0.0/kafka/ssl.html

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

https://www.sslshopper.com/article-most-common-java-keytool-keystore-commands.html

https://gist.github.com/alvarow/1a42e608d74474ac39aa

Download
wget -c http://apache.mirrors.hoobly.com/kafka/2.5.0/kafka_2.12-2.5.0.tgz -O - | tar -xz

LINUX
bin/zookeeper-server-start.sh  config/zookeeper.properties &

bin/kafka-server-start.sh  config/server.properties

bin/kafka-topics.sh --create  --zookeeper localhost:2181  --topic   chris-topic  --partitions 1  --replication-factor 1


bin/kafka-topics.sh --list --zookeeper localhost:2181



bin/kafka-console-producer.sh  --broker-list localhost:9092  --topic chris-topic

 hello world


bin/kafka-console-consumer.sh  --bootstrap-server localhost:9092   --topic chris-topic --from-beginning



bin/kafka-console-producer.sh --broker-list localhost:9092 --topic connect-test < /Users/chrismathew/kafkaCode/ipinyou.contest.dataset/training1st/bid.20130311.txt


