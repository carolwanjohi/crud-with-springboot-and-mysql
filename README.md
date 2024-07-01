# :spiral_notepad: CRUD with Springboot and MySQL

An introduction to Creating, Reading, Updating and Deleting data 
in a MySQL database using Springboot.
The tutorial used is 
[Getting Started with CRUD Operations in Spring Boot and MySQL: A Beginner's Guide](https://freedium.cfd/https://medium.com/linkit-intecs/getting-started-with-crud-operations-in-spring-boot-and-mysql-a-beginners-guide-756fd5b861d0)
on [Freedium](https://freedium.cfd/) by [Matheshyogeswaran](https://medium.com/@matheshyogeswaran).

## :pencil: Project Architecture

This implements a modular design that enhances maintainability and scalability.
The division between the controller, service, and implementation layers enables 
better code organization and easier debugging. 

Additionally, it aligns with the principles of the Spring framework, 
facilitating the development of robust and efficient applications.

```md
src
├── main
│   ├── java
│   │   └── com
│   │       └── crud
│   │           ├── controller
│   │           │   └── UserController.java
│   │           ├── model
│   │           │   └── User.java
│   │           ├── repository
│   │           │   └── UserRepository.java
│   │           ├── service
│   │           │   ├── UserService.java
│   │           │   └── impl
│   │           │       └── UserServiceImpl.java
│   │           └── CrudApplication.java
│   ├── resources
│   │   ├── application.properties
│   │   └── static (for static resources like CSS and JS)
│   │   └── templates (for HTML templates if using server-side rendering)
│   └── sql (for database schema scripts)
└── test
```

The controller initiates API calls, which are then processed by the service layer. 
The service layer interfaces with the implementation layer to handle the actual business logic. 

This layered architecture contributes to the development of a more structured, maintainable 
and comprehensible CRUD application.

## :bookmark: Running the application
#### Prerequisites
- Docker for the MySQL database
- Postman

#### Run application
1. Set up a collection in Postman
   - Import the [CRUD collection](./documents/postman-collection/CRUD.postman_collection.json) to Postman
2. Set up the MySQL database using Docker
    - Always ensure that the MySQL database is running before starting the application
```shell
docker compose up -d
```
3. Run the application![img1](./documents/assets/run-the-app.png)
4. Run the collection in Postman
    - The collection contains the following requests:
        - Create a user
        - Get all users
        - Get a user by ID
        - Update a user
        - Delete a user

## :hammer_and_pick: Extra features
- [ ] Query parameters in the `Get all users` request
- [x] Database access using JPA&Hibernate, MySQL as database
     - [ ] What is containerisation?
     - [ ] How does it work?
- [ ] Optional: Liquibase to manage your DB tables
- [x] Docker compose to boot your DB locally
- [ ] HTTP calls to other services, using Feign 
  - Use a public API like Nasa
- [ ] Understand Spring beans and their lifecycles, dependency injection 
  - Dependency Injection Basics in this link covers the most
- [ ] Secure endpoints with Spring Security and JWT
  - [Rest API spring security with JWT Tutorial](https://bootify.io/spring-security/rest-api-spring-security-with-jwt.html)
- [ ] Use Mapstruct to map DTOs <-> DB Entities
- [ ] Publish events from the application to a local Kafka instance 
  - Kafka can be locally booted with docker-compose, similar to MySQL DB.
    - Is this Redpanda?

## :books: Resources
- [Getting Started with CRUD Operations in Spring Boot and MySQL: A Beginner's Guide](https://freedium.cfd/https://medium.com/linkit-intecs/getting-started-with-crud-operations-in-spring-boot-and-mysql-a-beginners-guide-756fd5b861d0)
- [Rest api spring security with jwt](https://bootify.io/spring-security/rest-api-spring-security-with-jwt.html)
