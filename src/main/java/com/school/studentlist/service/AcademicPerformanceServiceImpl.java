package com.school.studentlist.service;

import com.school.studentlist.dto.request.PerformanceUpdateDtoRequest;
import com.school.studentlist.dto.response.PerformanceDtoResponse;
import com.school.studentlist.entity.Performance;
import com.school.studentlist.exception.ServiceException;
import com.school.studentlist.repository.AcademicPerformanceRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AcademicPerformanceServiceImpl implements AcademicPerformanceService {

    private ModelMapper mapper;
    private AcademicPerformanceRepository repository;

    @Autowired
    public AcademicPerformanceServiceImpl(ModelMapper mapper, AcademicPerformanceRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public PerformanceDtoResponse updatePerformance(PerformanceUpdateDtoRequest request) {
        repository.findById(request.getId())
                .orElseThrow(() -> new ServiceException(String.format("Запись с id %s в справочнике не найдена", request.getId())));
        Performance performanceToUpdate = mapper.map(request, Performance.class);
        return mapper.map(repository.save(performanceToUpdate), PerformanceDtoResponse.class);
    }
}