FROM openjdk:17-jdk-slim

WORKDIR /app

# Copy gradle wrapper and build files
COPY gradlew .
COPY gradle gradle/
COPY build.gradle .
COPY settings.gradle .
COPY system.properties .

# Make gradlew executable
RUN chmod +x ./gradlew

# Copy source code
COPY app/ app/

# Build the application
RUN ./gradlew clean bootJar -x test

# Expose port
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "build/libs/*.jar"]