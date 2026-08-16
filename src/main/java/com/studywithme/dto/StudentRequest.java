package com.studywithme.dto;

import lombok.*;

// For DTOs, many developers prefer
// because it is explicit and avoids generating unnecessary methods like equals(), hashCode(), and toString() when they are not needed.
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

// We Can use @Data as well. Yes We can , But we prefer that one
public class StudentRequest {
    private String name;
    private String email;
    private Integer age;
    private String course;
    private Long departmentId;
}