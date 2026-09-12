package com.studywithme.controller;

import com.studywithme.dto.StudentRequest;
import com.studywithme.dto.StudentResponse;
import com.studywithme.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    // Get-1 : 200
    @GetMapping("/{id}")
    public ResponseEntity<StudentResponse> getStudentById(@PathVariable Long id) {
        return ResponseEntity
                .ok(studentService.getStudentById(id));
    }

    // Delete : 204
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) { //<--
        studentService.deleteStudent(id); //<--
        return ResponseEntity
                .noContent().build(); //<--
    }


    // -----------------------------------------------------------------


    // Get-All : 200
    @GetMapping
    public ResponseEntity<List<StudentResponse>> getAllStudents() {
        return ResponseEntity
                .ok(studentService.getAllStudents());
    }

    // -----------------------------------------------------------------




    // POST : 201
    @PostMapping
    public ResponseEntity<StudentResponse> createStudent(@RequestBody StudentRequest request) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(studentService.createStudent(request));
    }


    // -----------------------------------------------------------------


    // 200
    @PutMapping("/{id}")
    public ResponseEntity<StudentResponse> updateStudent(@PathVariable Long id,@RequestBody StudentRequest request) {
        return ResponseEntity
                .ok(studentService.updateStudent(id, request));
    }


    // -----------------------------------------------------------------


    // 200
    @PatchMapping("/{id}")
    public ResponseEntity<StudentResponse> patchStudent(@PathVariable Long id,@RequestBody StudentRequest request){
        return ResponseEntity
                .ok(studentService.patchStudent(id, request)
        );
    }
}