# --- Build Stage ---
FROM gradle:8.2.1-jdk17-alpine AS builder
WORKDIR /app
COPY . .
RUN ./gradlew bootJar -x test --no-daemon

# --- Runtime Stage ---
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
# Fix: Copy from the app submodule's build directory
COPY --from=builder /app/app/build/libs/*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]