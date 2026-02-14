# Use lightweight JRE 21 base image
FROM eclipse-temurin:21-jre

# Set working directory inside container
WORKDIR /app

# Copy your jar into the image
COPY target/spring-kubernet.jar spring-kubernet.jar

# Expose app port (change if needed)
EXPOSE 8080

# Run the application
ENTRYPOINT ["java","-jar","/app/spring-kubernet.jar"]
