#FROM eclipse-temurin:21-jdk-jammy
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
COPY target/hi-service-1.0.jar /app/hi-service.jar
EXPOSE 4569
CMD ["java", "-jar", "hi-service.jar"]