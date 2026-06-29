package com.stringwavetech.school.client;

import com.stringwavetech.school.StudentModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.UUID;

@FeignClient(name = "student-service", url = "${application.config.students-url}")
public interface StudentClient {

    @GetMapping("/school/{school-id}")
    List<StudentModel> findAllStudentsBySchool(@PathVariable("school-id") UUID schoolId);
}