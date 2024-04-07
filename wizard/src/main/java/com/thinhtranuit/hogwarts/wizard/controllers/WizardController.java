package com.thinhtranuit.hogwarts.wizard.controllers;

import com.thinhtranuit.hogwarts.wizard.controllers.dto.Wizard;
import com.thinhtranuit.hogwarts.wizard.services.WizardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class WizardController implements V10Api{
    private final WizardService wizardService;

    @Override
    public ResponseEntity<List<Wizard>> getAllWizards(List<Integer> id) {
        log.info("Get wizard information ids {}", id);
        return ResponseEntity.ok(wizardService.findByIds(id));
    }
}
