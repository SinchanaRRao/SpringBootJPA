# Spring Boot JPA CRUD Project

This project demonstrates a simple implementation of CRUD operations using Spring Boot and JPA.

## Technologies Used

- Java 8
- Spring Boot
- Spring Data JPA
- Spring DevTools
- MySQL 
- Maven

## Setup

Configure the database connection in the application.properties file:
# Configure MySQL datasource
spring.datasource.url=jdbc:mysql://localhost:3306/employeedb?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=root

# Configure MySQL database driver
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# Hibernate properties
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.ddl-auto=update


## Usage
The project exposes the following RESTful endpoints:

GET /api/employees: Retrieve all employees. - http://localhost:8080/employees/
GET /api/employees/{id}: Retrieve an employee by ID. -http://localhost:8080/employees/1
POST /api/employees: Create a new employee. - http://localhost:8080/employees/
PUT /api/employees/{id}: Update an employee by ID. -http://localhost:8080/employees/1
DELETE /api/employees/{id}: Delete an employee by ID. -http://localhost:8080/employees/1
You can test the endpoints using a tool like cURL or Postman.


