Sure. These are the **common `JpaRepository` methods** and their return types.

| Method           | Return Type         | Meaning                             |
| ---------------- | ------------------- | ----------------------------------- |
| `save(student)`  | `Student`           | Returns the saved entity            |
| `findById(1L)`   | `Optional<Student>` | Returns Student if found            |
| `findAll()`      | `List<Student>`     | Returns all students                |
| `existsById(1L)` | `boolean`           | `true` if ID exists                 |
| `count()`        | `long`              | Number of records                   |
| `deleteById(1L)` | `void`              | Deletes the record; returns nothing |

### 1. `save()`

```java
Student savedStudent = studentRepository.save(student);
```

Return type:

```java
Student
```

Example:

```text
studentRepository.save(student)
             ↓
         Student
```

Useful because after saving, you can get generated values such as the generated ID.

---

### 2. `findById()`

```java
Optional<Student> student =
        studentRepository.findById(1L);
```

Return type:

```java
Optional<Student>
```

Why `Optional`?

Because the student may or may not exist.

```text
ID = 1
  ↓
Found     → Optional<Student>
Not Found → Optional.empty()
```

That's why you commonly see:

```java
studentRepository.findById(id)
        .orElseThrow(...);
```

---

### 3. `findAll()`

```java
List<Student> students =
        studentRepository.findAll();
```

Return type:

```java
List<Student>
```

Because multiple students can be returned.

```text
Database
   ↓
Student
Student
Student
   ↓
List<Student>
```

---

### 4. `existsById()`

```java
boolean exists =
        studentRepository.existsById(1L);
```

Return type:

```java
boolean
```

Only tells you whether the record exists.

```text
existsById(1L)

     ↓

true / false
```

---

### 5. `count()`

```java
long count =
        studentRepository.count();
```

Return type:

```java
long
```

For example:

```text
Database has 150 students
        ↓
count()
        ↓
150L
```

---

### 6. `deleteById()`

```java
studentRepository.deleteById(1L);
```

Return type:

```java
void
```

It performs the deletion but doesn't return the deleted object.

```text
deleteById(1L)
      ↓
   DELETE
      ↓
   void
```

### Easy way to remember

```text
save()        → Student
findById()    → Optional<Student>
findAll()     → List<Student>
existsById()  → boolean
count()       → long
deleteById()  → void
```

**One important interview point:** `save()` is **not just insert**. It can perform an **insert or update**, depending on whether the entity is considered new.
