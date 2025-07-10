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

# Configure port for Railway
ENV PORT=8080
EXPOSE $PORT

# Run the application with dynamic port
CMD ["sh", "-c", "java -Dserver.port=$PORT -jar target/*.jar"]