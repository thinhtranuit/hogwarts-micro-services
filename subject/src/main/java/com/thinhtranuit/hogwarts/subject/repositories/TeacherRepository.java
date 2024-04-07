package com.thinhtranuit.hogwarts.subject.repositories;

import com.thinhtranuit.hogwarts.subject.entities.Wizard;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "wizard")
public interface TeacherRepository {

    @GetMapping("/v1.0/wizards")
    List<Wizard> getWizards(@RequestParam("id") List<Integer> ids);
}
