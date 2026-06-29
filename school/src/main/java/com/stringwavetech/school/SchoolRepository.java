package com.stringwavetech.school;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface SchoolRepository extends JpaRepository<SchoolEntity, UUID> {

}
