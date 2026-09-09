Project Structure
```
studywithme
│
├── controller
│   └── StudentController.java
│
├── dto
│   └── StudentResponseDTO.java
│
├── entity
│   └── StudentEntity.java
│
├── repository
│   └── StudentRepository.java
│
├── service
│   └── StudentService.java
│
└── StudywithmeApplication.java
```

---

H2 Database

StudentEntity
Long id;
String name;
String email;
String course;


Lombok 



---


# H2 Default Values
INSERT INTO students (name, email, course)
VALUES ('Nishant Raj', 'nishant@gmail.com', 'Java');

INSERT INTO students (name, email, course)
VALUES ('Rahul Sharma', 'rahul@gmail.com', 'Spring Boot');

SELECT * FROM students;


---


# Filed Declaration Differnet Style
1. Traditional Setter — Non-Fluent
   User user = new User();
   user.setName("Alice");
   user.setEmail("alice@example.com");
   user.setAge(25);


2. withX() — Fluent Interface
   User user = new User()
   .withName("Alice")
   .withEmail("alice@example.com")
   .withAge(25);


3. Builder Pattern
   StudentEntity student = StudentEntity.builder()
   .name("Nishant")
   .email("nishant@gmail.com")
   .course("Spring Boot")
   .build();


https://dev.to/nk_sk_6f24fdd730188b284bf/understanding-fluent-api-in-spring-a-deep-dive-51lh

Builder Pattern + Fluent Interface
Difference Between Fluent Interface and Builder Pattern in Java


How to prune ?
git fetch --prune

