package com.thinhtranuit.hogwarts.wizard.mappers;

import com.thinhtranuit.hogwarts.wizard.controllers.dto.Wizard;
import com.thinhtranuit.hogwarts.wizard.entities.WizardJPA;
import org.mapstruct.Mapper;

@Mapper
public interface WizardMapper {
    Wizard map(WizardJPA wizardJPA);
}
