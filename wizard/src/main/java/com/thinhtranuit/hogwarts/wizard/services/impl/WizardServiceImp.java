package com.thinhtranuit.hogwarts.wizard.services.impl;

import com.thinhtranuit.hogwarts.wizard.controllers.dto.Wizard;
import com.thinhtranuit.hogwarts.wizard.mappers.WizardMapper;
import com.thinhtranuit.hogwarts.wizard.repositories.WizardRepository;
import com.thinhtranuit.hogwarts.wizard.services.WizardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class WizardServiceImp implements WizardService {

    private final WizardRepository wizardRepository;
    private final WizardMapper mapper;

    @Override
    public List<Wizard> findByIds(List<Integer> id) {
        return wizardRepository.findByIdIn(id).stream().map(mapper::map).collect(Collectors.toList());

    }
}
