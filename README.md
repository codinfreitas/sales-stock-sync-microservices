<h2>Projeto de Comunicação entre Microsserviços com Kafka</h2>
Este projeto demonstra a configuração e comunicação básica entre dois microsserviços utilizando Kafka. O ambiente é configurado via Docker Compose, e o gerenciamento dos tópicos é feito com Offset Explorer 3.0.
<br>

<h4>Arquitetura</h4>

- sales-service: Simula o serviço de vendas, que produz mensagens para o Kafka.
- stock-service: Simula o serviço de estoque, que consome mensagens do Kafka.

<h4>Tecnologias Utilizadas</h4>

- Java
- Spring Boot
- Apache Kafka
- Docker Compose
- Offset Explorer 3.0
- Spring Boot DevTools
- Lombok

<h4>Configuração dos Serviços</h4>

<strong>application.properties</strong> do sales-service:
  <br>
spring.application.name=sales-service<br>
server.port=8084<br>
spring.kafka.bootstrap-servers=:9092<br>
spring.kafka.producer.key-serializer=org.apache.kafka.common.serialization.StringSerializer<br>
spring.kafka.producer.value-serializer=org.apache.kafka.common.serialization.StringSerializer<br>

<strong>application.properties</strong> do stock-service:
  <br>
spring.application.name=stock-service<br>
server.port=8085<br>
spring.kafka.bootstrap-servers=:9092<br>
spring.kafka.producer.key-serializer=org.apache.kafka.common.serialization.StringSerializer<br>
spring.kafka.producer.value-serializer=org.apache.kafka.common.serialization.StringSerializer<br>
spring.kafka.consumer.auto-offset-reset=earliest<br>

<h4>Configuração do Ambiente Kafka</h4>

O Kafka é executado em contêineres Docker usando docker-compose. Após subir os contêineres, utilize o Offset Explorer 3.0 para criar o tópico no cluster Kafka.

<h4>Como Executar</h4>

- 1° Subir o ambiente Kafka com Docker Compose.
- 2° Criar o tópico no Kafka usando Offset Explorer 3.0.
- 3° Iniciar o sales-service e o stock-service.
- 4° Verificar a comunicação entre os serviços através do Kafka.



