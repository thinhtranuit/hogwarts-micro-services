package com.thinhtranuit.hogwarts.subject.services;

import com.thinhtranuit.hogwarts.subject.controllers.dto.Subject;
import com.thinhtranuit.hogwarts.subject.controllers.dto.Teacher;

import java.util.List;

public interface SubjectService {
    List<Subject> findAll();

    Teacher getTeacher(Integer id);
}
