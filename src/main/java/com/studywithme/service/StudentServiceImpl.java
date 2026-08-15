package com.studywithme.service;

import com.studywithme.dto.StudentRequest;
import com.studywithme.dto.StudentResponse;
import com.studywithme.entity.Student;
import com.studywithme.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public StudentResponse getStudentById(Long id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Student not found with id: " + id)
                );

        return mapToResponse(student);
    }

    @Override
    public List<StudentResponse> getAllStudents() {

        return studentRepository.findAll()
                .stream()
                .map(this::mapToResponse)
                .toList();
    }

    @Override
    public StudentResponse createStudent(StudentRequest request) {

        if (studentRepository.existsByEmail(request.getEmail())) {
            throw new RuntimeException(
                    "Student already exists with email: " + request.getEmail()
            );
        }

        Student student = new Student();
        student.setName(request.getName());
        student.setEmail(request.getEmail());
        student.setAge(request.getAge());
        student.setCourse(request.getCourse());
        student.setDepartmentId(request.getDepartmentId());
        LocalDateTime now = LocalDateTime.now();
        student.setCreatedAt(now);
        student.setUpdatedAt(now);
        Student savedStudent = studentRepository.save(student);
        return mapToResponse(savedStudent);
    }

    @Override
    public StudentResponse updateStudent(Long id,StudentRequest request) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Student not found with id: " + id
                        )
                );

        student.setName(request.getName());
        student.setEmail(request.getEmail());
        student.setAge(request.getAge());
        student.setCourse(request.getCourse());
        student.setDepartmentId(request.getDepartmentId());
        student.setUpdatedAt(LocalDateTime.now());
        Student updatedStudent = studentRepository.save(student);
        return mapToResponse(updatedStudent);
    }

    @Override
    public void deleteStudent(Long id) {
        if (!studentRepository.existsById(id)) {
            throw new RuntimeException(
                    "Student not found with id: " + id
            );
        }
        studentRepository.deleteById(id);
    }

    // ENTITY -> DTO | Phase 2 => Use Transformer | Phase3 => Mapper (3rd Party Library)
    private StudentResponse mapToResponse(Student student) {
        return StudentResponse.builder()
                .studentId(student.getStudentId())
                .name(student.getName())
                .email(student.getEmail())
                .age(student.getAge())
                .course(student.getCourse())
                .departmentId(student.getDepartmentId())
                .createdAt(student.getCreatedAt())
                .updatedAt(student.getUpdatedAt())
                .build();
    }
}