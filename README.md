# spring-boot-crud-demo

Spring Boot CRUD demo is demonstrating how to implement simple CRUD operations with a `Product` entity.
These are RESTful APIs.

## What's inside 
This project is based on the [Spring Boot](http://projects.spring.io/spring-boot/) project and uses these packages :
- Maven
- Spring Core
- Spring Data (Hibernate & MySQL)
- [Thymleaf](www.thymeleaf.org)

## Installation 
The project is created with Maven, so you just need to import it to your IDE and build the project to resolve the dependencies.
After cloning the repository and changing directory to project home directory, run following command to start the project:

```
mvn spring-boot:run
```

## Database configuration 
Create a MySQL database with the name `springbootdb`and add the credentials to `/resources/application.properties`.  
The default ones are :

```
spring.datasource.url=jdbc:mysql://localhost:3306/springbootdb
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
```

## Usage 
Run the project and try out apis.

### Create:
```
curl -X POST -H "Content-Type: application/json" -d '{
	"productId":"1",
	"name":"Cooler",
	"price":"8900"
}' "http://localhost:8080/products"
```

### Read
```
curl -X GET -H "Content-Type: application/json" "http://localhost:8080/products"
```

### Update
```
curl -X PUT -H "Content-Type: application/json" -d '{
	"productId":"1",
	"name":"Cooler",
	"price":"8500"
}' "http://localhost:8080/products/1"
```

### Delete
```
curl -X DELETE -H "Content-Type: application/json" -d '{
	"productId":"1",
	"name":"Cooler",
	"price":"8900"
}' "http://localhost:8080/products/1"
```