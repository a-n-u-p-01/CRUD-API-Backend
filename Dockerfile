# Use a base image that includes Java
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled JAR file into the container
COPY target/CURD-RestAPI-0.0.1-SNAPSHOT.jar app.jar

# Command to run the Spring Boot application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
# Use a base image that includes Java
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled JAR file into the container
COPY target/CURD-RestAPI-0.0.1-SNAPSHOT.jar app.jar

# Command to run the Spring Boot application
CMD ["java", "-jar", "target/CURD-RestAPI-0.0.1-SNAPSHOT.jar"]
