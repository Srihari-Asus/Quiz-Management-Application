# Quiz Management Application

A comprehensive, interactive, and scalable Quiz Management Application built using Spring Boot 3.x, Hibernate, JPA, and Spring Security. The platform enables educators, administrators, and organizations to design sophisticated quizzes, manage course enrollments, track learning performance patterns, and enforce academic integrity.

## Tech Stack
- **Backend framework**: Spring Boot 3.4.4
- **Security**: Spring Security allowing standard Open API endpoint access and REST queries
- **APIs and Docs**: OpenAPI 3 with Swagger UI integration (`springdoc-openapi`)

## Key Features & Entities
The database schema and logical configurations support the following models:
1. **User**: Management of platform users across various roles (Admin, Academic Admin, Educator, Student, Proctor, Analyst, Guest).
2. **Quiz**: Structured assessment creation containing creator references, timing metadata, configurations, and status.
3. **Question**: Advanced quiz questions supporting multiple question types, options, correct answers, difficulty ratings, tags, and points.
4. **QuizAttempt**: Lifecycle tracking of student quiz submissions including point scores, integration, and security checks.
5. **Response**: Per-question granular details, responses, correctness analysis, time spent, and confidence tracking.
6. **Course**: Organization of quiz resources by academic course sections and registrar enrollment.
7. **Enrollment**: Registration data linking students to academic courses.
8. **Gradebook**: Centralized repository documenting graded scores, dates, attempts, weights, and late submission markers.
9. **Analytics**: Metric logging tracking entity performance, distribution, learning styles, and objectives.
10. **IntegrityEvent**: Real-time audit logs flag suspicious activities, browser violations, or proctor incidents.

## APIs & Swagger Documentation
All REST endpoints are documented and interactive via Swagger UI.
- **Swagger UI URL**: [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)
- **OpenAPI definition**: `/v3/api-docs`

Exposed controller routes:
- `/api/quizzes` (Create and retrieve assessments - passes all unit tests)
- `/api/users` (CRUD operations for accounts)
- `/api/questions` (Creating, managing, and categorizing questions)
- `/api/courses` (Course management)
- `/api/attempts` (Creating and retrieving quiz attempts)
- `/api/responses` (Per-question response details)
- `/api/gradebook` (Grading and historical outcomes)
- `/api/analytics` (Retrieving metrics and tracking scores)
- `/api/integrity-events` (Cheat tracking and browser lockdown events)

## Project Setup & Verification

### Running Tests
To run the Maven unit tests:
```powershell
mvn test
```

### Running the Application
To run the server locally on port 8080:
```powershell
mvn spring-boot:run
```
Once launched, navigate to `http://localhost:8080/swagger-ui/index.html` to interact with the API endpoints.
