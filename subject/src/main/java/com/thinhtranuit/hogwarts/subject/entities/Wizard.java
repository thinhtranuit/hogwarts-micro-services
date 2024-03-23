package com.thinhtranuit.hogwarts.subject.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Wizard {

    private Integer id;

    private String name;

    private String gender;

    private String role;

}
