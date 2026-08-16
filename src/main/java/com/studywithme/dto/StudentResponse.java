package com.studywithme.dto;

/**
 * Created : 2026-08-15 18:40:44
 */

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentResponse {
    private Long studentId;
    private String name;
    private String email;
    private Integer age;
    private String course;
    private Long departmentId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}