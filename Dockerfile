# Use a base image that includes Java
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the entire project directory into the container
COPY . .

# Build the project (if necessary)
RUN ./mvnw clean package

# Command to run the Spring Boot application
CMD ["java", "-jar", "target/CURD-RestAPI-0.0.1-SNAPSHOT.jar"]
# Use a base image that includes Java
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the entire project directory into the container
COPY . .

# Build the project (if necessary)
RUN mvn clean package

# Command to run the Spring Boot application
CMD ["java", "-jar", "target/CURD-RestAPI-0.0.1-SNAPSHOT.jar"]
