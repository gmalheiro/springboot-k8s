# Usando uma imagem base do OpenJDK
FROM openjdk:17-jdk-slim
LABEL authors="gabriel-malheiro"

# Porta exposta
EXPOSE 8080

# Copiando o JAR gerado para o container
ADD target/springboot-k8s-0.0.1-SNAPSHOT.jar app.jar

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "/app.jar"]
