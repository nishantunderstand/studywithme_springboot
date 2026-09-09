package com.studywithme.dto;

public record StudentResponseDTO(
    Long id,
    String name,
    String email,
    String course
){}
