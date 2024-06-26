# CRUD with Springboot and MySQL

## Description
An introduction to Creating, Reading, Updating and Deleting data 
in a MySQL database using Springboot.
The tutorial used is 
[Getting Started with CRUD Operations in Spring Boot and MySQL: A Beginner's Guide](https://freedium.cfd/https://medium.com/linkit-intecs/getting-started-with-crud-operations-in-spring-boot-and-mysql-a-beginners-guide-756fd5b861d0)
on [Freedium](https://freedium.cfd/) by [Matheshyogeswaran](https://medium.com/@matheshyogeswaran).

## Project Architecture

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

## Resources
- [Getting Started with CRUD Operations in Spring Boot and MySQL: A Beginner's Guide](https://freedium.cfd/https://medium.com/linkit-intecs/getting-started-with-crud-operations-in-spring-boot-and-mysql-a-beginners-guide-756fd5b861d0)