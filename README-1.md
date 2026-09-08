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