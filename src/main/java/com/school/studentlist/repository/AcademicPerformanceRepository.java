package com.school.studentlist.repository;

import com.school.studentlist.entity.Performance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcademicPerformanceRepository extends JpaRepository<Performance, Integer> {
}
