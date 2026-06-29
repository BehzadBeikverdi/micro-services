package com.stringwavetech.student;

import java.util.List;
import java.util.UUID;

public interface StudentService {
    void saveStudent(StudentEntity student);

    List<StudentEntity> findAllStudents();

    List<StudentEntity> findAllStudentsBySchool(UUID schoolId);

}
