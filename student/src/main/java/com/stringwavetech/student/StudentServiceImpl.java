package com.stringwavetech.student;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;

    @Override
    public void saveStudent(StudentEntity student) {
        repository.save(student);
    }

    @Override
    public List<StudentEntity> findAllStudents() {
        return repository.findAll();
    }

    @Override
    public List<StudentEntity> findAllStudentsBySchool(UUID schoolId) {
        return repository.findAllBySchoolId(schoolId);
    }
}
