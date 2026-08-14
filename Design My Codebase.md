DTO
Controller 
Service
Reposistory
FacadeLayer 
Transformer
Entity

Database
MySQL


Student Employee Basic Project

How to design it ?
Here we are at design phase 
not coding phase 


---

┌──────────────────────┐
│      DEPARTMENT      │
├──────────────────────┤
│ PK department_id     │
│    name              │
│    description       │
│    created_at        │
│    updated_at        │
└──────────┬───────────┘
           │
           │ 1
           │
           │ N
┌──────────▼───────────┐
│       EMPLOYEE       │
├──────────────────────┤
│ PK employee_id       │
│    name              │
│    email             │
│    designation       │
│    salary             │
│ FK department_id     │
│    created_at        │
│    updated_at        │
└──────────────────────┘


┌──────────────────────┐
│       STUDENT        │
├──────────────────────┤
│ PK student_id        │
│    name              │
│    email             │
│    age               │
│    course            │
│    created_at        │
│    updated_at        │
└──────────────────────┘


                 DEPARTMENT
              ┌──────────────┐
              │ department_id│ PK
              │ name         │
              │ description  │
              └───────┬──────┘
                      │
             ┌────────┴────────┐
             │                 │
             │ 1               │ 1
             │                 │
             │ N               │ N
      ┌──────▼──────┐   ┌──────▼──────┐
      │   STUDENT   │   │  EMPLOYEE   │
      ├─────────────┤   ├─────────────┤
      │ student_id  │   │ employee_id │
      │ name        │   │ name        │
      │ email       │   │ email       │
      │ age         │   │ designation │
      │ course      │   │ salary      │
      │ department_id│  │ department_id│
      └─────────────┘   └─────────────┘	
			
			
			
                    Client
                      |
                      v
               +-------------+
               | Controller  |
               +-------------+
                      |
                      v
               +-------------+
               |   Facade    |
               +-------------+
                      |
                      v
               +-------------+
               |   Service   |
               +-------------+
                      |
          +-----------+-----------+
          |                       |
          v                       v
   +-------------+         +-------------+
   | Transformer |         | Repository  |
   +-------------+         +-------------+
          |                       |
          v                       v
        DTO                    Entity
                                  |
                                  v
                              MySQL DB


-- ============================================
-- 1. Create Database
-- ============================================

CREATE DATABASE student_employee_db;

USE student_employee_db;


-- ============================================
-- 2. Department Table
-- ============================================

CREATE TABLE department (
    department_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL UNIQUE,
    description VARCHAR(255),
    created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP
);


-- ============================================
-- 3. Student Table
-- ============================================

CREATE TABLE student (
    student_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(150) NOT NULL UNIQUE,
    age INT,
    course VARCHAR(100),
    department_id BIGINT,

    created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT fk_student_department
        FOREIGN KEY (department_id)
        REFERENCES department(department_id)
);


-- ============================================
-- 4. Employee Table
-- ============================================

CREATE TABLE employee (
    employee_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(150) NOT NULL UNIQUE,
    designation VARCHAR(100),
    salary DECIMAL(12,2),
    department_id BIGINT,

    created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT fk_employee_department
        FOREIGN KEY (department_id)
        REFERENCES department(department_id)
);					


USE student_employee_db;

-- ============================================
-- 1. Dummy Departments
-- ============================================

INSERT INTO department (name, description)
VALUES
('IT', 'Information Technology Department'),
('HR', 'Human Resources Department'),
('Finance', 'Finance and Accounting Department'),
('Operations', 'Business Operations Department');


-- ============================================
-- 2. Dummy Students
-- ============================================

INSERT INTO student
(name, email, age, course, department_id)
VALUES
('Rahul Sharma', 'rahul.sharma@example.com', 21, 'Computer Science', 1),
('Priya Singh', 'priya.singh@example.com', 22, 'Information Technology', 1),
('Aman Verma', 'aman.verma@example.com', 20, 'Computer Science', 1),
('Neha Gupta', 'neha.gupta@example.com', 23, 'Human Resources', 2),
('Rohit Kumar', 'rohit.kumar@example.com', 22, 'Finance', 3);


-- ============================================
-- 3. Dummy Employees
-- ============================================

INSERT INTO employee
(name, email, designation, salary, department_id)
VALUES
('Amit Kumar', 'amit.kumar@example.com', 'Software Engineer', 75000.00, 1),
('Sneha Patel', 'sneha.patel@example.com', 'Senior Software Engineer', 110000.00, 1),
('Vikas Mehta', 'vikas.mehta@example.com', 'HR Manager', 85000.00, 2),
('Pooja Shah', 'pooja.shah@example.com', 'Finance Manager', 95000.00, 3),
('Raj Malhotra', 'raj.malhotra@example.com', 'Operations Manager', 90000.00, 4);