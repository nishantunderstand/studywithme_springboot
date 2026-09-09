Version 1.7 : Spring Security

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
├── security
│   └── SecurityConfig.java
│       ├── securityFilterChain()
│       ├── userDetailService()
│       └── passwordEncoder()
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



# H2 Default Values
INSERT INTO students (name, email, course)
VALUES ('Nishant Raj', 'nishant@gmail.com', 'Java');

INSERT INTO students (name, email, course)
VALUES ('Rahul Sharma', 'rahul@gmail.com', 'Spring Boot');

SELECT * FROM students;





Wednesday, September 9, 2026 4:27:12 PM
http://localhost:8080
http://localhost:8080/h2-console
Both are two different thing.


Git Worktree
https://www.youtube.com/watch?v=grAsFn5yvjA
Suppose You want to switch from branch 1 to 2
with commit or stash
then you can use worktree
Little complicated to understand.


How to use in Intellij 🤔🤔🤔  




Learn Code With Durgesh
https://www.youtube.com/watch?v=y9NhIWN9ZK8




---


which is responsible for authorization ?
Who is responsible in spring ?



When we pass username and password 
who is responsible for this ?


