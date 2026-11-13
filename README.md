# Tasks REST API (Spring Boot)

Spring Boot 3.5 / Java 21 / Maven / Spring Web, Data JPA, Validation, H2

## Run
1. Open this folder in IntelliJ IDEA (File > Open > select pom.xml > Open as Project).
2. Wait for Maven to download dependencies.
3. Run TasksApplication.
4. Visit http://localhost:8080/api/tasks (should show []).

Or from a terminal (needs Maven + JDK 21): mvn spring-boot:run

## Test
- Postman, or IntelliJ built-in HTTP client: open requests.http and click the green arrows.
- Automated tests: mvn test
- Database viewer: http://localhost:8080/h2-console (JDBC URL jdbc:h2:mem:testdb, user sa, empty password)

## Endpoints
| Method | URL | Result |
|---|---|---|
| GET | /api/tasks | 200 list |
| GET | /api/tasks/{id} | 200 or 404 |
| POST | /api/tasks | 201 or 400 |
| PUT | /api/tasks/{id} | 200, 400 or 404 |
| DELETE | /api/tasks/{id} | 204 or 404 |

## Layers
Controller -> Service -> Repository -> H2 database
