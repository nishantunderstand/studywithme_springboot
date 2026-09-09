package com.studywithme.service;

import com.studywithme.dto.StudentResponseDTO;
import com.studywithme.entity.StudentEntity;
import com.studywithme.repository.StudentRepository;

import com.studywithme.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

// import jakarta.transaction.Transactional; //<-- This will cause Error
import org.springframework.transaction.annotation.Transactional; //<--

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentReposistory;

    // Cannot find @interface method 'readOnly()'
    // Issue : Check Import Jakarta Import
    // import jakarta.transaction.Transactional; //<-- This will cause Error 
    @Transactional(readOnly = true)
    public StudentResponseDTO findById(Long id) {
        // ENTITY
        StudentEntity  student = studentReposistory.findById(id).orElseThrow(()-> new RuntimeException("Student Doesn't Exists"));

        // Entity -> DTO

        StudentResponseDTO response = new StudentResponseDTO();
        response.setId(student.getId());
        response.setName(student.getName());
        response.setEmail(student.getEmail());
        response.setCourse(student.getCourse());
        return response;
    }
}
