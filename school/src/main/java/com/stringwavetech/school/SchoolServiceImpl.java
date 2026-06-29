package com.stringwavetech.school;

import com.stringwavetech.school.client.StudentClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class SchoolServiceImpl implements SchoolService {

    private final SchoolRepository repository;
    
    private final StudentClient client;

    @Override
    public void saveSchool(SchoolEntity student) {
        repository.save(student);
    }

    @Override
    public List<SchoolEntity> findAllSchools() {
        return repository.findAll();
    }

    @Override
    public FullSchoolResponse findSchoolsWithStudents(UUID schoolId) {

        var school = repository.findById(schoolId)
                .orElse(
                        SchoolEntity.builder()
                                .name("NOT_FOUND")
                                .email("NOT_FOUND")
                                .build()
                );

        var students = client.findAllStudentsBySchool(schoolId);

        return FullSchoolResponse.builder()
                .name(school.getName())
                .email(school.getEmail())
                .students(students)
                .build();
    }
}
