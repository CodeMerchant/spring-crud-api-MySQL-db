#Spring Boot CRUD Restful api

Dependencies:

- Spring Boot  Data JPA
- Spring Boot Web
- Spring Boot Lombok
- MySQL Driver

Server running at default port 8080

Add these to your application.properties file:

- spring.jpa.show-sql = true
- spring.jpa.hibernate.ddl-auto = update
- spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5Dialect
- spring.datasource.driver-class-name = com.mysql.cj.jdbc.Driver