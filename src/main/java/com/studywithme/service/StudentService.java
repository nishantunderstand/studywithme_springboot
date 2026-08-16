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
    public StudentResponse getStudentById(Long id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
        StudentResponse response = new StudentResponse();
        response.setStudentId(student.getStudentId());
        response.setName(student.getName());
        response.setEmail(student.getEmail());
        return response;
    }

    // GET /students
    public List<StudentResponse> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        List<StudentResponse> responses = new ArrayList<>();
        for (Student student : students) {
            StudentResponse response = new StudentResponse();
            response.setStudentId(student.getStudentId());
            response.setName(student.getName());
            response.setEmail(student.getEmail());
            responses.add(response);
        }
        return responses;
    }

    // POST /students
    public StudentResponse createStudent(StudentRequest request) {

        Student student = Student.builder()
                .name(request.getName())
                .email(request.getEmail())
                .build();
        Student savedStudent = studentRepository.save(student);
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

    // DELETE /students/{id}
    public void deleteStudent(Long id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
        studentRepository.delete(student);
    }
}