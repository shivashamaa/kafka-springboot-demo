# Kafka Spring Boot Demo

## Features
- Kafka Producer using Spring Boot
- Kafka Consumer with Consumer Group
- Parallel processing using partitions
- Multiple consumers using concurrency

## Tech Stack
- Java 17
- Spring Boot
- Apache Kafka

## How to Run
1. Start Kafka & Zookeeper
2. Run consumer-service
3. Run producer-service

Command:
to start kafka : kafka-server-start /opt/homebrew/etc/kafka/server.properties
to see the list of topic : kafka-topics --describe --topic orders-topic --bootstrap-server localhost:9092
