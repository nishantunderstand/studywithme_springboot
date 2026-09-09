package com.studywithme.reposistory;

import com.studywithme.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentReposistory extends JpaRepository<StudentEntity,Long> {
}
