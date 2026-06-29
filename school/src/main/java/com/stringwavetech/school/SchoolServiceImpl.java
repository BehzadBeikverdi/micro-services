package com.stringwavetech.school;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class SchoolServiceImpl implements SchoolService {

    private final SchoolRepository repository;

    @Override
    public void saveSchool(SchoolEntity student) {
        repository.save(student);
    }

    @Override
    public List<SchoolEntity> findAllSchools() {
        return repository.findAll();
    }
}
