package com.school.studentlist.controller;

import com.school.studentlist.dto.request.PerformanceUpdateDtoRequest;
import com.school.studentlist.dto.response.PerformanceDtoResponse;
import com.school.studentlist.service.AcademicPerformanceService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/performance")
@Schema(description = "Операции по работе со справочником успеваемости")
public class AcademicPerformanceController {
    private AcademicPerformanceService service;

    @Autowired
    public AcademicPerformanceController(AcademicPerformanceService service) {
        this.service = service;
    }

    @PutMapping
    @Operation(description = "Внесение изменений в справочник успеваемости")
    public PerformanceDtoResponse updatePerformance(@RequestBody @Valid PerformanceUpdateDtoRequest request) {
        return service.updatePerformance(request);
    }
}
