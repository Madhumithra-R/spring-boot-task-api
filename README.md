# 🚀 Tasks REST API

A RESTful Task Management API built using **Java 21** and **Spring Boot 3.5**, featuring CRUD operations, input validation, exception handling, and layered architecture.

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.5-brightgreen)
![Maven](https://img.shields.io/badge/Build-Maven-blue)
![Database](https://img.shields.io/badge/Database-H2-blue)

## ✨ Features

- Complete CRUD operations for task management.
- Input validation using Jakarta Bean Validation.
- Global exception handling with meaningful JSON responses.
- Layered architecture (Controller, Service, Repository).
- Unit testing using JUnit 5 and MockMvc.
- H2 in-memory database integration.

## 🛠️ Tech Stack

Java 21 | Spring Boot 3.5 | Spring Data JPA | Hibernate | H2 | Maven | JUnit 5 | Mockito

## 🏗️ Architecture

```text
Client → Controller → Service → Repository → H2
```

## 🔗 API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/tasks` | Get all tasks |
| GET | `/api/tasks/{id}` | Get task by ID |
| POST | `/api/tasks` | Create task |
| PUT | `/api/tasks/{id}` | Update task |
| DELETE | `/api/tasks/{id}` | Delete task |

## ⚙️ Getting Started

**Clone the repository:**

```bash
git clone https://github.com/Madhumithra-R/spring-boot-task-api.git
cd spring-boot-task-api
```

**Run the application:**

```bash
mvn spring-boot:run
```

API Base URL: `http://localhost:8080/api/tasks`

## 🧪 Run Tests

```bash
mvn test
```

## 🗄️ H2 Database Console

`http://localhost:8080/h2-console`

JDBC URL: `jdbc:h2:mem:testdb`

## 🚀 Future Enhancements

- [ ] DTO implementation
- [ ] MySQL integration
- [ ] Pagination and sorting
- [ ] JWT authentication
- [ ] Swagger documentation

## 👩‍💻 Author

**Madhumithra R**

[GitHub](https://github.com/Madhumithra-R) | [LinkedIn](https://www.linkedin.com/in/madhumithra-r/)
