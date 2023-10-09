package com.school.studentlist.service;

import com.school.studentlist.dto.request.PerformanceUpdateDtoRequest;
import com.school.studentlist.dto.response.PerformanceDtoResponse;

public interface AcademicPerformanceService {
    PerformanceDtoResponse updatePerformance(PerformanceUpdateDtoRequest request);
}
