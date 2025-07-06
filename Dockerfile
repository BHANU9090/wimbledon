# Use a lightweight Java image
FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

# Copy the JAR file
COPY build/libs/*.jar app.jar

EXPOSE 8080

# Run the JAR
CMD ["java", "-jar", "app.jar"]
