# --- Build Stage ---
FROM gradle:8.2.1-jdk17-alpine AS builder
WORKDIR /app
COPY . .
RUN ./gradlew build -x test --no-daemon

# --- Runtime Stage ---
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
