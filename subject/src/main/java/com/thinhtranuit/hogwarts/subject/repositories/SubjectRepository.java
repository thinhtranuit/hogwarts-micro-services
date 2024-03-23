package com.thinhtranuit.hogwarts.subject.repositories;

import com.thinhtranuit.hogwarts.subject.entities.SubjectJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SubjectRepository
        extends JpaRepository<SubjectJPA, Integer>, JpaSpecificationExecutor<SubjectJPA> {
}
