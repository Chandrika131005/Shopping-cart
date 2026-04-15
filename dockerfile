FROM openjdk:21-jdk-slim

WORKDIR /app
COPY target/shopping-cart-1.0.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]