package com.thinhtranuit.hogwarts.wizard.entities;

import com.thinhtranuit.hogwarts.wizard.models.Gender;
import com.thinhtranuit.hogwarts.wizard.models.Role;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "wizard")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WizardJPA {

    @Id
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    @Column(name = "role")
    @Enumerated(value = EnumType.STRING)
    private Role role;
}
