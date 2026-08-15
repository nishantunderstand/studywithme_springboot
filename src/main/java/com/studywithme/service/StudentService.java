package com.studywithme.service;

import com.studywithme.dto.StudentRequest;
import com.studywithme.dto.StudentResponse;
import com.studywithme.entity.Student;
import com.studywithme.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    // GET /students/{id}
    public StudentResponse getStudentById(Long id) {

        Student student = studentRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Student not found with id: " + id));

        return mapToResponse(student);
    }

    // GET /students
    public List<StudentResponse> getAllStudents() {

        return studentRepository.findAll()
                .stream()
                .map(this::mapToResponse)
                .toList();
    }

    // POST /students
    public StudentResponse createStudent(StudentRequest request) {

        Student student = Student.builder()
                .name(request.getName())
                .email(request.getEmail())
                .build();

        Student savedStudent = studentRepository.save(student);

        return mapToResponse(savedStudent);
    }

    // PUT /students/{id}
    public StudentResponse updateStudent(Long id, StudentRequest request) {

        Student student = studentRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Student not found with id: " + id));

        student.setName(request.getName());
        student.setEmail(request.getEmail());

        Student updatedStudent = studentRepository.save(student);

        return mapToResponse(updatedStudent);
    }

    // DELETE /students/{id}
    public void deleteStudent(Long id) {

        Student student = studentRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Student not found with id: " + id));

        studentRepository.delete(student);
    }

    // Entity → Response DTO
    private StudentResponse mapToResponse(Student student) {

        return StudentResponse.builder()
                .studentId(student.getStudentId())
                .name(student.getName())
                .email(student.getEmail())
                .build();
    }
}