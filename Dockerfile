# Use OpenJDK 17 as base image
FROM openjdk:17-jdk-slim

# Set working directory inside container
WORKDIR /app

# Copy Maven wrapper files first (for better Docker layer caching)
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .

# Fix permissions for Maven wrapper - THIS FIXES THE RAILWAY ERROR
RUN chmod +x ./mvnw

# Copy source code
COPY src src

# Build the application using Maven wrapper
RUN ./mvnw clean install -DskipTests

# Expose port 8080 (default Spring Boot port)
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "target/*.jar"]