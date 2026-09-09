package com.studywithme.service;

import com.studywithme.dto.StudentResponseDTO;
import com.studywithme.entity.StudentEntity;
import com.studywithme.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentReposistory;

    public StudentResponseDTO getStudentById(Long id) {
        StudentEntity students = studentReposistory.findById(id)
                .orElseThrow(()-> new RuntimeException("Student Doesn't Exisit"));

        // Entity -> DTO
        // Setter Based Approach : FAILED
        // Builder Based Approach :
        // Constructor Based Approach

        // Constructor Based Approach
        return new StudentResponseDTO(
                students.getId(),
                students.getName(),
                students.getEmail(),
                students.getCourse()
        );
    }
}


/**
 * StudentEntity → student.getName()
 * DTO/record    → dto.name()
 */