# Use an official OpenJDK image as base
FROM openjdk:17

# Set working directory inside the container
WORKDIR /app

# Copy the JAR file from the local machine to the container
COPY target/springboot-product.jar /app/springboot-product.jar


# Command to run the application
ENTRYPOINT ["java", "-jar", "/app/springboot-product.jar"]
