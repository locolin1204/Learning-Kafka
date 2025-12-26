# Kafka Example

[Download the Kafka 3.1.0](https://kafka.apache.org/downloads) and extract it
```bash
tar -xzf kafka_2.12-3.1.0.tgz
cd kafka_2.12-3.1.0
```


Run the following commands in order to start all services in the correct order
```bash
bin/zookeeper-server-start.sh config/zookeeper.properties
```

Open another terminal session and run:
```bash
bin/kafka-server-start.sh config/server.properties
```

Read Kafka messages from a topic (e.g. topic: "colin")
```bash
bin/kafka-console-consumer.sh --topic colin --from-beginning --bootstrap-server localhost:9092
```

Create a POST request to produce the message
```bash
###
POST http://localhost:8080/api/v1/messages
Content-Type: application/json

{
  "message": "API with Kafka"
}
```
Reference:
https://kafka.apache.org/31/documentation.html#quickstart
