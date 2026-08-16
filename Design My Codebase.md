


-- ============================================
-- 1. Department Table
-- ============================================

CREATE TABLE department (
department_id BIGINT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(100) NOT NULL UNIQUE,
description VARCHAR(255),
created_at DATETIME NOT NULL,
updated_at DATETIME NOT NULL
);


-- ============================================
-- 2. Student Table
-- ============================================

CREATE TABLE student (
student_id BIGINT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(100) NOT NULL,
email VARCHAR(150) NOT NULL UNIQUE,
age INT,
course VARCHAR(100),
department_id BIGINT,
created_at DATETIME NOT NULL,
updated_at DATETIME NOT NULL,

    CONSTRAINT fk_student_department
        FOREIGN KEY (department_id)
        REFERENCES department(department_id)
);


INSERT INTO department
(name, description, created_at, updated_at)
VALUES
('Computer Science', 'Computer Science and Software Engineering', NOW(), NOW()),
('Information Technology', 'Information Technology and Systems', NOW(), NOW()),
('Electronics', 'Electronics and Communication Engineering', NOW(), NOW()),
('Mechanical', 'Mechanical Engineering', NOW(), NOW()),
('Civil', 'Civil Engineering', NOW(), NOW());



INSERT INTO student
(name, email, age, course, department_id, created_at, updated_at)
VALUES
('Rahul Kumar', 'rahul.kumar@gmail.com', 21, 'B.Tech', 1, NOW(), NOW()),
('Priya Sharma', 'priya.sharma@gmail.com', 22, 'B.Tech', 2, NOW(), NOW()),
('Amit Singh', 'amit.singh@gmail.com', 20, 'BCA', 1, NOW(), NOW()),
('Neha Verma', 'neha.verma@gmail.com', 23, 'M.Tech', 3, NOW(), NOW()),
('Rohit Gupta', 'rohit.gupta@gmail.com', 21, 'B.Tech', 4, NOW(), NOW());


1. GET     /api/students
2. GET     /api/students/1
3. POST    /api/students
4. GET     /api/students/7
5. PUT     /api/students/7
6. PATCH   /api/students/7
7. DELETE  /api/students/7
8. GET     /api/students/7