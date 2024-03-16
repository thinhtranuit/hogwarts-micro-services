package com.thinhtranuit.hogwarts.subject.services.impl;

import com.thinhtranuit.hogwarts.subject.controllers.dto.Subject;
import com.thinhtranuit.hogwarts.subject.mappers.SubjectMapper;
import com.thinhtranuit.hogwarts.subject.repositories.SubjectRepository;
import com.thinhtranuit.hogwarts.subject.services.SubjectService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Slf4j
@Service
public class SubjectServiceImpl implements SubjectService {
    private final SubjectRepository subjectRepository;
    private final SubjectMapper subjectMapper;

    @Override
    public List<Subject> findAll() {
        return subjectRepository.findAll().stream().map(subjectMapper::map).collect(Collectors.toList());
    }
}
