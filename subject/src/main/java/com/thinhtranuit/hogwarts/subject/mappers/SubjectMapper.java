package com.thinhtranuit.hogwarts.subject.mappers;

import com.thinhtranuit.hogwarts.subject.controllers.dto.Subject;
import com.thinhtranuit.hogwarts.subject.entities.SubjectJPA;
import org.mapstruct.Mapper;

@Mapper
public interface SubjectMapper {
    Subject map(SubjectJPA subjectJPA);
}
