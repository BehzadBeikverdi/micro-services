package com.stringwavetech.school;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = BaseEntity.PREFIX + "schools")
public class SchoolEntity extends BaseEntity {

    private String name;
    private String email;
}
