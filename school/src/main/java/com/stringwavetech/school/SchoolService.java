package com.stringwavetech.school;

import java.util.List;
import java.util.UUID;

public interface SchoolService {

    void saveSchool(SchoolEntity student);

    List<SchoolEntity> findAllSchools();

    FullSchoolResponse findSchoolsWithStudents(UUID schoolId);
}
