Version 1.6 :Removing Lombok Shifting to Record Class

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

H2 Database

StudentEntity
Long id;
String name;
String email;
String course;


# H2 Default Values
INSERT INTO students (name, email, course)
VALUES ('Nishant Raj', 'nishant@gmail.com', 'Java');

INSERT INTO students (name, email, course)
VALUES ('Rahul Sharma', 'rahul@gmail.com', 'Spring Boot');

SELECT * FROM students;


# Lombok -> Record Worst Decision
```java
public record Employee(String name, int id) {}

// in another class
Employee e = new Employee("Nishant", 101);
String n = e.name();   // not getName()
int id = e.id();       // not getId()
```




Entity -> DTO
1. Setter Based Approach 
2. Builder Based Approach
3. Constructor Based Approach
