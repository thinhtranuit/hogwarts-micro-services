package com.thinhtranuit.hogwarts.subject.services;

import com.thinhtranuit.hogwarts.subject.controllers.dto.Subject;

import java.util.List;

public interface SubjectService {
    List<Subject> findAll();
}
