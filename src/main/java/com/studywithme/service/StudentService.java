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

        // Traditional Based Approach
//        StudentResponseDTO studentResponseDTO = new StudentResponseDTO();
//        studentResponseDTO.setId(students.getId());
//        studentResponseDTO.setName(students.getName());
//        studentResponseDTO.setEmail(students.getEmail());
//        studentResponseDTO.setCourse(students.getCourse());
//        return studentResponseDTO;

//        // Constructor Based Approach
//        return new StudentResponseDTO(
//                students.getId(),
//                students.getName(),
//                students.getEmail(),
//                students.getCourse()
//        );

        // Builder Design Pattern
        return StudentResponseDTO.builder()
                .id(students.getId())
                .name(students.getName())
                .email(students.getEmail())
                .course(students.getCourse())
                .build();

    }
}
