package com.studywithme.service;

import com.studywithme.dto.StudentRequest;
import com.studywithme.dto.StudentResponse;

import java.util.List;

public interface StudentService {

    StudentResponse getStudentById(Long id);

    List<StudentResponse> getAllStudents();

    StudentResponse createStudent(StudentRequest request);

    StudentResponse updateStudent(Long id, StudentRequest request);

    void deleteStudent(Long id);
}