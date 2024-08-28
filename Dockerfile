# Use uma imagem base do OpenJDK 21
FROM openjdk:21-jdk-slim

# Crie o diretório de trabalho
RUN mkdir -p /app

# Copie o arquivo JAR da sua aplicação para dentro do contêiner
COPY build/libs/*.jar /app/app.jar

# Define o diretório de trabalho como /app
WORKDIR /app

# Comando para iniciar a aplicação Spring Boot ao iniciar o contêiner
CMD ["java", "-jar", "app.jar"]
