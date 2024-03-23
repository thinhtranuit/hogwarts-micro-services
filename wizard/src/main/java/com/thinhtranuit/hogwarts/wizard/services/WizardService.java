package com.thinhtranuit.hogwarts.wizard.services;

import com.thinhtranuit.hogwarts.wizard.controllers.dto.Wizard;

import java.util.List;

public interface WizardService {
    List<Wizard> findByIds(List<Integer> id);
}
