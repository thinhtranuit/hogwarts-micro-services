package com.thinhtranuit.hogwarts.subject.controllers;

import com.thinhtranuit.hogwarts.subject.controllers.dto.Subject;
import com.thinhtranuit.hogwarts.subject.controllers.dto.Teacher;
import com.thinhtranuit.hogwarts.subject.services.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class SubjectController implements V10Api {
    private final SubjectService subjectService;

    @Override
    public ResponseEntity<List<Subject>> getAllSubjects() {
        return ResponseEntity.ok(subjectService.findAll());
    }

    @Override
    public ResponseEntity<Teacher> getSubjectTeacher(Integer id) {
        return ResponseEntity.ok(subjectService.getTeacher(id));
    }
}
