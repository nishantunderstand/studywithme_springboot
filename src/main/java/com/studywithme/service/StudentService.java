package com.studywithme.service;

import com.studywithme.dto.StudentResponseDTO;
import com.studywithme.entity.StudentEntity;
import com.studywithme.reposistory.StudentReposistory;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentReposistory studentReposistory;

    @Transactional
    public StudentResponseDTO findById(Long id) {
        // ENTITY
        StudentEntity  student = studentReposistory.findById(id).orElseThrow(()-> new RuntimeException("Student Doesn't Exists"));

        // Entity -> DTO

        StudentResponseDTO response = new StudentResponseDTO();
        response.setId(student.getId());
        response.setName(student.getName());
        response.setEmail(student.getEmail());

        return response;
    }
}
