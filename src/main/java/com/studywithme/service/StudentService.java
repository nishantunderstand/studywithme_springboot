package com.studywithme.service;

import com.studywithme.dto.StudentRequest;
import com.studywithme.dto.StudentResponse;
import com.studywithme.entity.Student;
import com.studywithme.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    // GET /students/{id}
    // 1. Setter Approach
    public StudentResponse getStudentById(Long id) {

        // 1. Get Student from DB
        Student student = studentRepository.findById(id)
                .orElseThrow(() ->new RuntimeException("Student not found with id: " + id));

        // orElse
        // orElseThrow
        // Do we have 2 types of overlaoded Stream


        // 2. Convert Entity -> Response DTO
        StudentResponse response = new StudentResponse();
        response.setStudentId(student.getStudentId());
        response.setName(student.getName());
        response.setEmail(student.getEmail());
        response.setAge(student.getAge());
        response.setCourse(student.getCourse());
        response.setDepartmentId(student.getDepartmentId());
        response.setCreatedAt(student.getCreatedAt());
        response.setUpdatedAt(student.getUpdatedAt());

        // 3. Return Response DTO
        return response;
    }



    // DELETE /students/{id}
    public void deleteStudent(Long id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
        studentRepository.delete(student);
    }



    // GET /students
    public List<StudentResponse> getAllStudents() {
        List<Student> students = studentRepository.findAll();

        List<StudentResponse> responses = new ArrayList<>();
        // Why Iterate Over Result Obtained from Repo ?

        for (Student student : students) {
            StudentResponse response = new StudentResponse(); //<--

            response.setStudentId(student.getStudentId());
            response.setName(student.getName());
            response.setEmail(student.getEmail());
            response.setAge(student.getAge());
            response.setCourse(student.getCourse());
            response.setDepartmentId(student.getDepartmentId());
            response.setCreatedAt(student.getCreatedAt());
            response.setUpdatedAt(student.getUpdatedAt());

            responses.add(response); //<--
        }
        return responses;
    }


   // POST /students
    public StudentResponse createStudent(StudentRequest request) {
        // Setting the Data
        Student student = new Student();
        student.setName(request.getName());
        student.setEmail(request.getEmail());

        Student savedStudent = studentRepository.save(student);

        // Entity -> DTO
        StudentResponse response = new StudentResponse();
        response.setStudentId(savedStudent.getStudentId());
        response.setName(savedStudent.getName());
        response.setEmail(savedStudent.getEmail());

        return response;
    }


    // PUT /students/{id}
    public StudentResponse updateStudent(Long id, StudentRequest request) {

        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));

        student.setName(request.getName());
        student.setEmail(request.getEmail());

        Student updatedStudent = studentRepository.save(student);
        StudentResponse response = new StudentResponse();

        response.setStudentId(updatedStudent.getStudentId());
        response.setName(updatedStudent.getName());
        response.setEmail(updatedStudent.getEmail());
        return response;
    }

    // PATCH /students/{id}
    public StudentResponse patchStudent(Long id, StudentRequest request) {

        Student student = studentRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Student not found with id: " + id));

        // Partial Update
        if (request.getName() != null) {
            student.setName(request.getName());
        }

        if (request.getEmail() != null) {
            student.setEmail(request.getEmail());
        }

        Student updatedStudent = studentRepository.save(student);


        // Create Response
        StudentResponse response = new StudentResponse();

        response.setStudentId(updatedStudent.getStudentId());
        response.setName(updatedStudent.getName());
        response.setEmail(updatedStudent.getEmail());
        response.setAge(updatedStudent.getAge());
        response.setCourse(updatedStudent.getCourse());
        response.setDepartmentId(updatedStudent.getDepartmentId());
        response.setCreatedAt(updatedStudent.getCreatedAt());
        response.setUpdatedAt(updatedStudent.getUpdatedAt());

        return response;
    }
}