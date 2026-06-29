package com.stringwavetech.student;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = BaseEntity.PREFIX + "students")
public class StudentEntity extends BaseEntity {

    private String firstname;
    private String lastname;
    private String email;
    private UUID schoolId;
}
