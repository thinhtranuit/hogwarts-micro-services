package com.thinhtranuit.hogwarts.subject.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "subject")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubjectJPA {

    @Id
    private Integer id;

    @Column(name = "subject_name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    private Integer teacherId;
}
