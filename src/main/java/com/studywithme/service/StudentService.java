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
        StudentEntity student = studentReposistory.findById(id)
                .orElseThrow(()-> new RuntimeException("Student Doesn't Exisit"));

        // Traditional Approach
        StudentResponseDTO studentResponseDTO = new StudentResponseDTO();
        studentResponseDTO.setId(student.getId());
        studentResponseDTO.setName(student.getName());
        studentResponseDTO.setEmail(student.getEmail());
        studentResponseDTO.setCourse(student.getCourse());
        return studentResponseDTO;



    }
}
