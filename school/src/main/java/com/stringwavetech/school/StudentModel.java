package com.stringwavetech.school;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentModel {

    private String firstname;
    private String lastname;
    private String email;
}
