package com.studywithme.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentRequest {

    private String name;

    private String email;

    private Integer age;

    private String course;

    private Long departmentId;
}