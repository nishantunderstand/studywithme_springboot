package com.studywithme.controller;

import com.studywithme.dto.StudentRequest;
import com.studywithme.dto.StudentResponse;
import com.studywithme.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/{id}")
    public ResponseEntity<StudentResponse> getStudentById(
            @PathVariable Long id) {

        return ResponseEntity.ok(
                studentService.getStudentById(id)
        );
    }

    @GetMapping
    public ResponseEntity<List<StudentResponse>> getAllStudents(
            RequestEntity<Void> request) {

        return ResponseEntity.ok(
                studentService.getAllStudents()
        );
    }

    @PostMapping
    public ResponseEntity<StudentResponse> createStudent(
            RequestEntity<StudentRequest> request) {

        StudentRequest studentRequest = request.getBody();

        StudentResponse response =
                studentService.createStudent(studentRequest);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<StudentResponse> updateStudent(
            @PathVariable Long id,
            RequestEntity<StudentRequest> request) {

        StudentRequest studentRequest = request.getBody();

        return ResponseEntity.ok(
                studentService.updateStudent(id, studentRequest)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(
            @PathVariable Long id) {

        studentService.deleteStudent(id);

        return ResponseEntity.noContent().build();
    }
}